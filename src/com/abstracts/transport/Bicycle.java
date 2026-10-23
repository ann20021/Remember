package com.abstracts.transport;

public class Bicycle extends Transport {

    public Bicycle() {
        super(2);
    }

    @Override
    public boolean isAbleDriveRoad(int countNails) {
        int countPercent = 10;
        int countWholeWheels = getCountWheels();

        for (int i = 0; i < countNails; i++) {
            if (isWheelBurst(countPercent)) {
                countWholeWheels--;

                if (countWholeWheels == 0) {
                    return false;
                }
                countPercent = countPercent - 5;
            }
        }
        return true;
    }


}