package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Coffee;
import com.example.demo.service.CoffeeService;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/coffees")
public class CoffeeController {
    private final CoffeeService coffeeService;

    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @GetMapping
    public List<Coffee> getAll() {
        return coffeeService.getAllCoffees();
    }

    @GetMapping("/{id}")
    public Coffee getOne(@PathVariable String id) {
        return coffeeService.getCoffeeById(id)
                .orElseThrow(() -> new RuntimeException("Coffee not found"));
    }

    @PostMapping
    public Coffee createCoffee(@RequestBody Coffee coffee) {
        return coffeeService.addCoffee(coffee);
    }

    @PutMapping("/{id}")
    public Coffee updateOne(@PathVariable String id, @RequestBody Coffee coffee) {
        return coffeeService.updateCoffee(id, coffee);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable String id) {
        coffeeService.deleteCoffee(id);

    }

}
