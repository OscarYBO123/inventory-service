package com.example.inventoryservice.service;

import com.example.inventoryservice.dto.InventoryResponse;

public interface InventoryService {

    InventoryResponse findByProductId(Long productId);
}