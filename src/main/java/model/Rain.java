/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents rainfall data for the past 1 hour.
 * Example JSON: "rain": { "1h": 0.23 }
 */
public class Rain {

    @JsonProperty("1h")
    private Double last1Hour;

    public Rain() {
        // Default constructor needed for Jackson
    }

    // public Rain(Double last1Hour) {
    //     this.last1Hour = last1Hour;
    // }

    public Double getLast1Hour() {

        // if (last1Hour == null) {
        //     return 0.0; // Return 0 if no data is available
        // }
        return last1Hour;
    }

    public void setLast1Hour(Double last1Hour) {
        this.last1Hour = last1Hour;
    }

    @Override
    public String toString() {
        return "Rain in last 1h: " + last1Hour + " mm";
    }
}