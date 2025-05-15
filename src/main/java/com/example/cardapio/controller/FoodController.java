package com.example.cardapio.controller;

import com.example.cardapio.Food.Food;
import com.example.cardapio.Food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Controller da aplicação
@RequestMapping // end-point do controller = food, mapiando o request que for para o food
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @GetMapping
    private List<Food> getAll(){

        List<Food> foodList = repository.findAll();
        return foodList;
    }
}
