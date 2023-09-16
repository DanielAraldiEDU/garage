import java.util.Scanner;

import com.vehicle.air.Helicopter;
import com.vehicle.aquatic.Yacht;
import com.vehicle.land.Car;
import com.vehicle.land.Truck;

public class App {
	public static void main(String[] args) throws Exception {
		Shed shed = new Shed();

		Scanner scanner = new Scanner(System.in);

		boolean isExit = false;

		do {
			System.out.println("\nOptions:\n1) Insert vehicle\n2) Get details vehicle\n3) Exit\nChoose an option:");
			int option = scanner.nextInt();

			isExit = option == 3;

			switch (option) {
				case 1: {
					System.out.println("\nChoose a vehicle option:\n1) Car\n2) Truck\n3) Yacht\n4) Helicoper\n5) Exit\n");
					int choose = scanner.nextInt();
					scanner.nextLine();

					switch (choose) {
						case 1: {
							System.out.println("Power:");
							double power = scanner.nextDouble();
							scanner.nextLine();

							System.out.println("Model:");
							String model = scanner.nextLine();

							System.out.println("Plate:");
							String plate = scanner.nextLine();

							System.out.println("Driver:");
							String driver = scanner.nextLine();
							scanner.reset();

							Car car = new Car(power, model, plate);
							car.setDriver(driver);
							shed.addVehicle(car);

							System.out.println("Car added successfully!");
							break;
						}
						case 2: {
							System.out.println("Capacity:");
							double capacity = scanner.nextDouble();
							scanner.nextLine();

							System.out.println("Model:");
							String model = scanner.nextLine();

							System.out.println("Plate:");
							String plate = scanner.nextLine();

							System.out.println("Driver:");
							String driver = scanner.nextLine();

							Truck truck = new Truck(capacity, model, plate);
							truck.setDriver(driver);
							shed.addVehicle(truck);

							System.out.println("Truck added successfully!");
							break;
						}
						case 3: {
							System.out.println("Name:");
							String name = scanner.nextLine();

							System.out.println("Captain:");
							String captain = scanner.nextLine();

							Yacht yacht = new Yacht(name);
							yacht.setCaptain(captain);
							shed.addVehicle(yacht);

							System.out.println("Yacht added successfully!");
							break;
						}
						case 4: {
							System.out.println("Acronym:");
							String acronym = scanner.nextLine();

							System.out.println("Model:");
							String model = scanner.nextLine();

							System.out.println("Pilot:");
							String pilot = scanner.nextLine();

							Helicopter helicopter = new Helicopter(model, acronym);
							helicopter.setPilot(pilot);
							shed.addVehicle(helicopter);

							System.out.println("Helicopter added successfully!");
							break;
						}
						case 5: {
							System.out.println("Bye Bye!");
							break;
						}
						default: {
							System.out.println("This vehicle option doesn't exist!");
							break;
						}
					}
					break;
				}
				case 2: {
					String detailsVehicle = shed.getAllVehicles();
					if (detailsVehicle.equals("")) {
						System.out.println("No vehicles found!");
					} else {
						System.out.println(detailsVehicle);
					}
					break;
				}
				case 3: {
					System.out.println("Bye Bye!");
					break;
				}
				default: {
					System.out.println("Invalid option! Choose a different option.");
					break;
				}
			}
		} while (!isExit);

		scanner.close();
	}
}
