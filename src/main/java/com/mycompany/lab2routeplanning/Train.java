/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2routeplanning;

/**
 *
 * @author Тарас
 */
public class Train implements TransportMode {
    private final double speed = 100; 
    private final double fuelConsumption = 2; 

    @Override
    public String getType() {
        return "Train";
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public double calculateFuel(double distance) {
        return (distance / 100) * fuelConsumption;
    }
}
