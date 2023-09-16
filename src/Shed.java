import com.vehicle.Vehicle;

public class Shed {
  private Vehicle[] vehicles = new Vehicle[999];

  public Shed() {
  }

  public void addVehicle(Vehicle vehicle) {
    for (int index = 0; index < vehicles.length; index++) {
      if (vehicles[index] == null) {
        vehicles[index] = vehicle;
        break;
      }
    }
  }

  public String getAllVehicles() {
    String allVehicles = "";
    for (int index = 0; index < vehicles.length; index++) {
      if (vehicles[index] != null) {
        allVehicles += vehicles[index].getDetailsVehicle() + "\n";
      }
    }
    return allVehicles;
  }
}
