package com.abstracts.transport;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Transport {
//объект в абстрактном классе не может быть

    private int countWheels;

    protected int getCountWheels() {
        return countWheels;
    }

    protected Transport(int countWheels) {
        this.countWheels = countWheels;
    }

    public abstract boolean isAbleDriveRoad(int countNails);

    protected boolean isWheelBurst(int countPercent){
        int randomNumber =  ThreadLocalRandom.current().nextInt(0, 100);
        return randomNumber <= countPercent;
    }
}
