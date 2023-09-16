package com.vehicle.aquatic;

import com.vehicle.Vehicle;

public class Yacht implements Vehicle {
  private String name;
  private String captain;

  public Yacht(String name) {
    this.name = name;
  }

  public void setCaptain(String name) {
    this.captain = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String getDetailsVehicle() {
    return "\nName: " + this.name + " | Captaion: " + this.captain + "\n";
  }
}
