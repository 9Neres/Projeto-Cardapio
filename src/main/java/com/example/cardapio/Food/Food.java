package com.example.cardapio.Food;


import com.example.cardapio.controller.FoodResponseDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "foods")
@Entity(name = "foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Food {

    // Atributos para o data base
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    private Long id;

    private String title;

    private String image;

    private Integer price;

    public Food(FoodRequestDTO data){
        this.title = data.title();
        this.image = data.image();
        this.price = data.price();
    }
}