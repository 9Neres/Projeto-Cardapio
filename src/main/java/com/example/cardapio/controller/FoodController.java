package com.example.cardapio.controller;

import com.example.cardapio.Food.Food;
import com.example.cardapio.Food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Controller da aplicação
@RequestMapping("food") // end-point do controller = food, mapiando o request que for para o food
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        repository.save(foodData);
    }

    @GetMapping
    private List<FoodResponseDTO> getAll(){

        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO :: new).toList();
        return foodList;
    }
}
