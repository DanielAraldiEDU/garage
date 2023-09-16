package com.vehicle.aquatic;

public class Yacht {
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
}
