package com.example.inventoryservice.mapper;

import com.example.inventoryservice.dto.InventoryResponse;
import com.example.inventoryservice.entity.Inventory;
import org.springframework.stereotype.Component;

@Component
public class InventoryMapper {

    public InventoryResponse toResponse(Inventory inventory) {

        InventoryResponse response = new InventoryResponse();

        response.setProductId(inventory.getProductId());
        response.setQuantity(inventory.getQuantity());
        response.setInStock(inventory.getQuantity() > 0);

        return response;
    }
}