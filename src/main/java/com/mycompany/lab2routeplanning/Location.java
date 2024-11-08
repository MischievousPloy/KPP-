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

public class Location {
    private String name;
    private ZoneId timeZone;
    public double latitude;
    public double longitude;

    public Location(String name, ZoneId timeZone, double latitude, double longitude) {
        this.name = name;
        this.timeZone = timeZone;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public ZoneId getTimeZone() {
        return timeZone;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
