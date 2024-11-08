/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.lab2routeplanning;

/**
 *
 * @author Тарас
 */
public interface TransportMode {
    String getType();
    double getSpeed(); 
    double getFuelConsumption(); 
    double calculateFuel(double distance); 
}

