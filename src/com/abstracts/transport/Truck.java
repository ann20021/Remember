package com.abstracts.transport;

public class Truck extends Transport{

    public Truck() {
        super(6);
    }

    @Override
    public boolean isAbleDriveRoad(int countNails) {
        int countPercent = 12;
        int countWholeWheels = getCountWheels();

        for (int i = 0; i < countNails; i++) {
            if (isWheelBurst(countPercent)) {
                countWholeWheels--;

                if (countWholeWheels == 1){
                    countPercent = 80;
                }

                if (countWholeWheels == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
