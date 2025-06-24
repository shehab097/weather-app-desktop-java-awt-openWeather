package com.shehab.weather.app.project.tools;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author sheha
 */
public class UnitConverter {

    // timee zone convert
    public static String unixToHHMMSS(long unixSeconds, double timeZone) {
        Instant instant = Instant.ofEpochSecond(unixSeconds);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss")
                .withZone(ZoneOffset.ofTotalSeconds((int)timeZone));
        return formatter.format(instant);
    }

    // time converter
    public static String getTimeZoneFromOffsetSeconds(Long offsetSeconds) {
        int sec = offsetSeconds.intValue();
        ZoneOffset offset = ZoneOffset.ofTotalSeconds(sec);
        return offset.toString();
    }

    // degree to direction
    public static String degToDirection(int deg) {
        String[] directions = {
            "N", "NNE", "NE", "ENE", "E", "ESE", "SE", "SSE",
            "S", "SSW", "SW", "WSW", "W", "WNW", "NW", "NNW"
        };
        int index = (int) Math.round(((double) deg % 360) / 22.5) % 16;
        return directions[index];
    }

    //hPa tp mmHg
    public static double hPaToMmHg(double hPa) {
        return hPa * 0.75006;
    }

    // m/s to km/h
    public static double msToKmh(double metersPerSecond) {
        return metersPerSecond * 3.6;
    }

}
