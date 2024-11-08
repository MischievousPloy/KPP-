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

public class Route {
    private Location start;
    private Location end;
    private List<Location> stops;
    private TransportMode mode;
    private double duration;
    private double fuel;

    public Route(Location start, Location end, List<Location> stops, TransportMode mode, double duration, double fuel) {
        this.start = start;
        this.end = end;
        this.stops = stops;
        this.mode = mode;
        this.duration = duration;
        this.fuel = fuel;
    }

    public void displayRouteDetails() {
        System.out.println("Route from " + start.getName() + " to " + end.getName());
        System.out.println("Stops: ");
        for (Location stop : stops) {
            System.out.println(" - " + stop.getName());
        }
        System.out.println("Mode of Transport: " + mode.getType());
        System.out.println("Total Travel Duration: %.2f hours%n" + duration + " %.2f hours");
        System.out.println("Total Fuel Consumption: %.2f liters%n" + fuel + " %.2f liters");
    }
}

