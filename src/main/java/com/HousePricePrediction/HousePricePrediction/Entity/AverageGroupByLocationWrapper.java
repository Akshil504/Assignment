package com.HousePricePrediction.HousePricePrediction.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AverageGroupByLocationWrapper {
    private String location;
    private Double average;
}
