package com.vehicle.land;

import com.vehicle.LandVehicle;

public class Car extends LandVehicle {
  private double power;

  public Car(double power, String model, String plate) {
    super(model, plate);
    this.power = power;
  }

  public double getPower() {
    return this.power;
  }

  @Override
  public String detail() {
    return "\nCar: " + this.model +
        " | Plate: " + this.plate +
        " | Power: " + this.power +
        " | Driver: " + this.driver + "\n";
  }
}
