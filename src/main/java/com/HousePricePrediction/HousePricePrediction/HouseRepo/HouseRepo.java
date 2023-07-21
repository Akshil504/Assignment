package com.HousePricePrediction.HousePricePrediction.HouseRepo;

import com.HousePricePrediction.HousePricePrediction.Entity.AverageGroupByLocationWrapper;
import com.HousePricePrediction.HousePricePrediction.Entity.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface HouseRepo extends JpaRepository<House,Long> {
    @Query(value = "SELECT AVG(h.sale_price) FROM house_details.house1 h;",nativeQuery = true)
    double getAverageSalePriceOverall();

    @Query(value = "SELECT h.location AS location, AVG(h.sale_price) AS average FROM house_details.house1 AS h GROUP BY h.location;",nativeQuery = true)
    List<Object[]> getAverageSalePricePerLocation();

    @Query(value = "SELECT MAX(h.sale_price) FROM house_details.house1 h",nativeQuery = true)
    double getMaxSalePrice();

    @Query(value = "SELECT MIN(h.sale_price) FROM house_details.house1 h",nativeQuery = true)
    double getMinSalePrice();
}
