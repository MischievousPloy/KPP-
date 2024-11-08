/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2routeplanning;

/**
 *
 * @author Тарас
 */
public class RouteSegment {
    private Location start;
    private Location end;
    private TransportMode transportMode;
    private double distance; 

    public RouteSegment(Location start, Location end, TransportMode transportMode, double distance) {
        this.start = start;
        this.end = end;
        this.transportMode = transportMode;
        this.distance = distance;
    }

    public double calculateDuration() {
        return distance / transportMode.getSpeed();
    }

    public double calculateFuelNeeded() {
        return (distance / 100) * transportMode.getFuelConsumption();
    }
}

