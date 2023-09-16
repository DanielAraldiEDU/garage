package com.vehicle.air;

import com.vehicle.Vehicle;

public class Helicopter implements Vehicle {
  private String model;
  private String acronym;
  private String pilot;

  public Helicopter(String model, String acronym) {
    this.model = model;
    this.acronym = acronym;
  }

  public void setPilot(String name) {
    this.pilot = name;
  }

  public String detail() {
    return "\nHelicopter: " + this.model +
        " | Acronym: " + this.acronym +
        " | Pilot: " + this.pilot + "\n";
  }

  @Override
  public String getDetailsVehicle() {
    return this.detail();
  }
}
