package Homework5.Task2.Builders;

import Homework5.Task2.CarParts.Engine;

public class EngineBuilder {
    private double power;
    private double volume;
    private double torque;
    private String fuelType;

    public EngineBuilder setPower(double power) {
        this.power = power;
        return this;
    }

    public EngineBuilder setVolume(double volume) {
        this.volume = volume;
        return this;
    }

    public EngineBuilder setTorque(double torque) {
        this.torque = torque;
        return this;
    }

    public EngineBuilder setFuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public Engine build(){
        return new Engine(power,volume,torque,fuelType);
    }
}
