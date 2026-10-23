package com.abstracts;

import com.abstracts.transport.Bicycle;
import com.abstracts.transport.Cars;
import com.abstracts.transport.Truck;

public class AbstractExercise {

    public static void main(String[] args){
        Bicycle bicycle = new Bicycle();
        Cars cars = new Cars();
        Truck truck = new Truck();

        int countNails = 100;
        int countTransport = 1000;

        int countFinishedBikes = 0;
        for (int i = 0; i < countTransport; i++){
            if (bicycle.isAbleDriveRoad(countNails)){
                countFinishedBikes++;
            }
        }

        int countFinishedCars = 0;
        for (int i = 0; i < countTransport; i++){
            if (cars.isAbleDriveRoad(countNails)){
                countFinishedCars++;
            }
        }

        int countFinishedTrucks = 0;
        for (int i = 0; i < countTransport; i++){
            if (truck.isAbleDriveRoad(countNails)){
                countFinishedTrucks++;
            }
        }

    System.out.println("Количество финишировавших велосипедов: " + countFinishedBikes);
    System.out.println("Количество финишировавших автомобилей: " + countFinishedCars);
    System.out.println("Количество финишировавших грузовиков: " + countFinishedTrucks);

    }

}
