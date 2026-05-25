package com.example.inventoryservice.service.impl;

import com.example.inventoryservice.dto.InventoryResponse;
import com.example.inventoryservice.entity.Inventory;
import com.example.inventoryservice.exception.ResourceNotFoundException;
import com.example.inventoryservice.mapper.InventoryMapper;
import com.example.inventoryservice.repository.InventoryRepository;
import com.example.inventoryservice.service.InventoryService;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService {

    private final InventoryRepository repository;
    private final InventoryMapper mapper;

    public InventoryServiceImpl(InventoryRepository repository,
                                InventoryMapper mapper) {

        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public InventoryResponse findByProductId(Long productId) {

        Inventory inventory = repository.findByProductId(productId)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Inventario no encontrado para producto: " + productId));

        return mapper.toResponse(inventory);
    }
}