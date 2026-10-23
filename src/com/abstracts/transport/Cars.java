package com.abstracts.transport;

public class Cars extends Transport{

    public Cars() {
        super(4);
    }

    @Override
    public boolean isAbleDriveRoad(int countNails) {
        int countPercent = 11;
        int countWholeWheels = getCountWheels();

        for (int i = 0; i < countNails; i++) {
            if (isWheelBurst(countPercent)) {
                countWholeWheels--;

                if (countWholeWheels == 0) {
                    return false;
                }

                countPercent++;
            }
        }
        return true;
    }
}
