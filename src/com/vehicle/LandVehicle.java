package com.vehicle;

public abstract class LandVehicle implements Vehicle {
  protected String model;
  protected String plate;
  protected String driver;

  public LandVehicle(String model, String plate) {
    this.model = model;
    this.plate = plate;
  }

  public void setDriver(String name) {
    this.driver = name;
  }

  public String getPlate() {
    return this.plate;
  }

  public abstract String detail();
}
