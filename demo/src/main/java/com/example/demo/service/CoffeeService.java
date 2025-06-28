package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Coffee;

@Service
public class CoffeeService {

    private final List<Coffee> coffeeList = new ArrayList<>();

    public CoffeeService() {
        coffeeList.addAll(List.of(
                new Coffee("Café Cereza"),
                new Coffee("Café Ganador"),
                new Coffee("Café Lareño"),
                new Coffee("Café Três Pontas")));
    }

    public List<Coffee> getAllCoffees() {
        return coffeeList;
    }

    public Optional<Coffee> getCoffeeById(String id) {
        return coffeeList.stream()
                .filter(c -> c.getID().equals(id))
                .findFirst();
    }

    public Coffee addCoffee(Coffee coffee) {
        coffeeList.add(coffee);
        return coffee;
    }

    public Coffee updateCoffee(String id, Coffee updatecoffee) {
        for (int index = 0; index < coffeeList.size(); index++) {
            if (coffeeList.get(index).getID().equals(id)) {
                coffeeList.set(index, updatecoffee);

            }
            return updatecoffee;
        }
        coffeeList.add(updatecoffee);
        return updatecoffee;
    }

    public void deleteCoffee(String id) {
        coffeeList.removeIf(c -> c.getID().equals(id));

    }

}
