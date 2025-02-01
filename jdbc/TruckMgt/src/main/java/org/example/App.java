package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        TruckService truckService = new TruckService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1. Add Truck");
            System.out.println("2. Get Truck by ID");
            System.out.println("3. Update Truck");
            System.out.println("4. Get All Trucks");
            System.out.println("5. Delete Truck");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter truck name:");
                    String name = scanner.next();
                    System.out.println("Enter truck model:");
                    String model = scanner.next();
                    System.out.println("Enter truck capacity:");
                    int capacity = scanner.nextInt();
                    System.out.println("Enter driver name:");
                    String driverName = scanner.next();
                    Truck truck = new Truck(name, model, capacity, driverName);
                    truckService.addTruck(truck);
                    break;
                case 2:
                    System.out.println("Enter truck ID:");
                    int id = scanner.nextInt();
                    Truck fetchedTruck = truckService.getTruckById(id);
                    System.out.println("Truck data: " + fetchedTruck);
                    break;
                case 3:
                    System.out.println("Enter truck ID to update:");
                    int updateId = scanner.nextInt();
                    Truck truckToUpdate = truckService.getTruckById(updateId);
                    if (truckToUpdate != null) {
                        System.out.println("Enter new driver name:");
                        truckToUpdate.setDriverName(scanner.next());
                        truckService.updateTruck(truckToUpdate);
                        System.out.println("Updated truck data: " + truckService.getTruckById(updateId));
                    } else {
                        System.out.println("Truck not found.");
                    }
                    break;
                case 4:
                    List<Truck> allTrucks = truckService.getAllTrucks();
                    System.out.println("All trucks in DB:");
                    for (Truck t : allTrucks) {
                        System.out.println(t);
                    }
                    break;
                case 5:
                    System.out.println("Enter truck ID to delete:");
                    int deleteId = scanner.nextInt();
                    truckService.deleteTruck(deleteId);
                    System.out.println("Deleted truck with ID: " + deleteId);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}