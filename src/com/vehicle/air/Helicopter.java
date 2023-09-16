package com.vehicle.air;

public class Helicopter {
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
}
