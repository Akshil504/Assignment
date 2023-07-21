package com.HousePricePrediction.HousePricePrediction.Services;

import com.HousePricePrediction.HousePricePrediction.Entity.AverageGroupByLocationWrapper;
import com.HousePricePrediction.HousePricePrediction.Entity.House;
import com.HousePricePrediction.HousePricePrediction.HouseRepo.HouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HouseService {
    @Autowired
    private HouseRepo houserepo;

    public List<House> getAllHouse () {
        return houserepo.findAll();
    }
    public House saveHouse (House house) {
        houserepo.save(house);
        return house;
    }

    public List<House> saveAllHouse(List<House> houses) {
        return houserepo.saveAll(houses);
    }
    public Double getAverageSalePriceOverall() {
//        double sum = 0;
//        List<House> houses = houserepo.findAll();
//        for (House h : houses) {
//            sum += h.getSalePrice();
//            System.out.println(h.getSalePrice());
//        }
//        return sum / houses.size();
//         System.out.println("hello");
         return houserepo.getAverageSalePriceOverall();
    }

    public List<AverageGroupByLocationWrapper> getAverageSalePricePerLocation() {
        List<Object[]> list = houserepo.getAverageSalePricePerLocation();
        List<AverageGroupByLocationWrapper> ans = new ArrayList<>();
        for (Object[] objects : list) {
            AverageGroupByLocationWrapper averageGroupByLocationWrapper = new AverageGroupByLocationWrapper();
            averageGroupByLocationWrapper.setLocation(objects[0].toString());
            averageGroupByLocationWrapper.setAverage((Double) objects[1]);
            ans.add(averageGroupByLocationWrapper);
        }

        return ans;
    }

    public double getMaxSalePrice() {
        return houserepo.getMaxSalePrice();
    }

    public double getMinSalePrice() {
        return houserepo.getMinSalePrice();
    }
}
