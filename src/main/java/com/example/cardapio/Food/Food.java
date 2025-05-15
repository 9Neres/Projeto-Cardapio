package com.example.cardapio.Food;


import jakarta.persistence.*;

@Table(name = "foods")
@Entity(name = "foods")

public class Food {

    // Atributos para o data base
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tittle;

    private String image;

    private Integer price;

}
