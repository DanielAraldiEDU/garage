package com.vehicle.land;

import com.vehicle.LandVehicle;

public class Truck extends LandVehicle {
  private double capacity;

  public Truck(double capacity, String model, String plate) {
    super(model, plate);
    this.capacity = capacity;
  }

  public double getCapacity() {
    return this.capacity;
  }

  @Override
  public String detail() {
    return "\nTruck: " + this.model +
        " | Plate: " + this.plate +
        " | Capacity: " + this.capacity +
        " | Driver: " + this.driver + "\n";
  }
}
