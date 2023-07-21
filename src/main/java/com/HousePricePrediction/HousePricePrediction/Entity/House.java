package com.HousePricePrediction.HousePricePrediction.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "house1")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private float bedrooms;
    private float bathrooms;
    private float squareFootage;
    private String location;
    private double salePrice;
}