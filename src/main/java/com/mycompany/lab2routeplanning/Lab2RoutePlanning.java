/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2routeplanning;

/**
 *
 * @author Тарас
 */




import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab2RoutePlanning {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter start location name: ");
        String startName = scanner.nextLine();
        System.out.print("Enter start location latitude: ");
        double startLatitude = scanner.nextDouble();
        System.out.print("Enter start location longitude: ");
        double startLongitude = scanner.nextDouble();
        scanner.nextLine(); 
        
        System.out.print("Enter start location time zone (e.g., Europe/Kyiv): ");
        String startTimeZone = scanner.nextLine();
        Location start = new Location(startName, ZoneId.of(startTimeZone), startLatitude, startLongitude);

    
        System.out.print("Enter end location name: ");
        String endName = scanner.nextLine();
        System.out.print("Enter end location latitude: ");
        double endLatitude = scanner.nextDouble();
        System.out.print("Enter end location longitude: ");
        double endLongitude = scanner.nextDouble();
        scanner.nextLine(); 
        
        System.out.print("Enter end location time zone (e.g., Europe/Berlin): ");
        String endTimeZone = scanner.nextLine();
        Location end = new Location(endName, ZoneId.of(endTimeZone), endLatitude, endLongitude);

     
        System.out.print("Enter the number of stops: ");
        int numberOfStops = scanner.nextInt();
        scanner.nextLine(); 
        Location[] stops = new Location[numberOfStops];
        
        for (int i = 0; i < numberOfStops; i++) {
            System.out.print("Enter stop #" + (i + 1) + " name: ");
            String stopName = scanner.nextLine();
            System.out.print("Enter stop #" + (i + 1) + " latitude: ");
            double stopLatitude = scanner.nextDouble();
            System.out.print("Enter stop #" + (i + 1) + " longitude: ");
            double stopLongitude = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter stop #" + (i + 1) + " time zone (e.g., Europe/Warsaw): ");
            String stopTimeZone = scanner.nextLine();
            stops[i] = new Location(stopName, ZoneId.of(stopTimeZone), stopLatitude, stopLongitude);
        }

        // Вибір транспорту
        System.out.println("Choose the transport mode: ");
        System.out.println("1. Car");
        System.out.println("2. Train");
        System.out.println("3. Plane");
        int choice = scanner.nextInt();
        TransportMode transport = null;
        
        switch (choice) {
            case 1:
                transport = new Car();
                break;
            case 2:
                transport = new Train();
                break;
            case 3:
                transport = new Plane();
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Car.");
                transport = new Car();
        }

        
        System.out.print("Enter the maximum travel time in hours: ");
        double maxTravelTime = scanner.nextDouble();
        
    
        RoutePlanner planner = new RoutePlanner();
        Route route = planner.planRoute(start, end, Arrays.asList(stops), transport, maxTravelTime);
        

        if (route != null) {
            route.displayRouteDetails();
        } else {
            System.out.println("Could not plan the route within the given time limit.");
        }
        
        scanner.close(); 
    }
}
