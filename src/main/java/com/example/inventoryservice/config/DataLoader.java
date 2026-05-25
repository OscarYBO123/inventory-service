package com.example.inventoryservice.config;

import com.example.inventoryservice.entity.Inventory;
import com.example.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final InventoryRepository repository;

    public DataLoader(InventoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {

        Inventory inventory = new Inventory();

        inventory.setProductId(1L);
        inventory.setQuantity(15);

        repository.save(inventory);

        System.out.println("INVENTARIO INSERTADO");
    }
}