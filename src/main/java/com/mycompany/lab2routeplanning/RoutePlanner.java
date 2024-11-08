/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2routeplanning;

/**
 *
 * @author Тарас
 */
import java.util.List;

public class RoutePlanner {
    public Route planRoute(Location start, Location end, List<Location> stops, TransportMode mode, double maxHours) {
        double totalDistance = calculateTotalDistance(start, end, stops);
        double travelTime = totalDistance / mode.getSpeed();

        if (travelTime > maxHours) {
            System.out.println("Travel time exceeds maximum allowed hours.");
            return null;
        }

        double totalFuel = (totalDistance / 100) * mode.getFuelConsumption();
        return new Route(start, end, stops, mode, travelTime, totalFuel);
    }

   private double calculateTotalDistance(Location start, Location end, List<Location> stops) {
        double totalDistance = 0.0;

      
        Location previous = start;
        for (Location stop : stops) {
            totalDistance += calculateDistance(previous, stop);
            previous = stop;
        }
        totalDistance += calculateDistance(previous, end); 

        return totalDistance;
    }

    private double calculateDistance(Location loc1, Location loc2) {
        final int EARTH_RADIUS = 6371; 

        double latDistance = Math.toRadians(loc2.latitude - loc1.latitude);
        double lonDistance = Math.toRadians(loc2.longitude - loc1.longitude);

        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) +
                   Math.cos(Math.toRadians(loc1.latitude)) * Math.cos(Math.toRadians(loc2.latitude)) *
                   Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return EARTH_RADIUS * c;
    }
}
