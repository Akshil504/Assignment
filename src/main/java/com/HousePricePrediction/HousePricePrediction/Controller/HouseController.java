package com.HousePricePrediction.HousePricePrediction.Controller;

import com.HousePricePrediction.HousePricePrediction.Entity.AverageGroupByLocationWrapper;
import com.HousePricePrediction.HousePricePrediction.Entity.House;
import com.HousePricePrediction.HousePricePrediction.Services.HouseService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HouseController {
    @Autowired
    private HouseService houseService;

    @GetMapping("/get")
    public List<House> getHouse () {
        return this.houseService.getAllHouse();
    }


    @PostMapping("/saveOne")
    public House saveHouse (@RequestBody String house) {
        Gson gson = new Gson();
        House house1 = gson.fromJson(house, House.class);
        return this.houseService.saveHouse(house1);
    }

    @PostMapping("/save")
    public List<House> saveAllHouse (@RequestBody String houses) {
        Gson gson = new Gson();
        List<House> house1 = gson.fromJson(houses, new TypeToken<List<House>>(){}.getType());
        return this.houseService.saveAllHouse(house1);
    }

    @GetMapping("/averageSalePriceOverall")
    public Double getAverageSalePriceOverall() {
        return houseService.getAverageSalePriceOverall();
    }

    @GetMapping("/averageSalePricePerLocation")
    public List<AverageGroupByLocationWrapper> getAverageSalePricePerLocation() {
        return this.houseService.getAverageSalePricePerLocation();
    }

    @GetMapping("/maxSalePrice")
    public double getMaxSalePrice() {
        return houseService.getMaxSalePrice();
    }

    @GetMapping("/minSalePrice")
    public double getMinSalePrice() {
        return houseService.getMinSalePrice();
    }

}
