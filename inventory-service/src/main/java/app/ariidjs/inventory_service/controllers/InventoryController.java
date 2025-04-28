package app.ariidjs.inventory_service.controllers;

import org.springframework.web.bind.annotation.*;

import app.ariidjs.inventory_service.service.InventoryService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@RequestParam String skuCode, Integer quantity) {
        return inventoryService.isInStock(skuCode, quantity);
    }
}
