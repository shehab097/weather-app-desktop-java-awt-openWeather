/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.shehab.weather.app.project;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import model.WeatherData;
import gui.WeatherDIsplay;
// import java.util.logging.Level;
// import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class WeatherAppProject {

    private String city = "dhaka";

    public WeatherAppProject() {
        city = "dhaka";
    }

    // public WeatherAppProject(String cityName) {
    // city = cityName;
    // }

    public void start(String cityName) {
        try {

            WeatherData weatherData = new WeatherData();

            String url = "https://api.openweathermap.org/data/2.5/weather?q=" + cityName
                    + "+&appid=907e91122aea5cf6a934d1036ee644d1&units=metric";

            // System.out.println(url);
            HttpResponse<String> response = Unirest.get(url)
                    .header("Content-Type", "application/json")
                    .asString();

            ObjectMapper mapper = new ObjectMapper();

            if (response.getStatus() == 200) {
                String responseBody = response.getBody();

                try {
                    weatherData = mapper.readValue(responseBody, WeatherData.class);

                    WeatherDIsplay wdi = new WeatherDIsplay(weatherData);
                    wdi.setVisible(true);
                    wdi.setLocationRelativeTo(null); // Center the window
                    wdi.setDefaultCloseOperation(WeatherDIsplay.DISPOSE_ON_CLOSE);

                } catch (Exception e) {
                    new JOptionPane();
                    JOptionPane.showMessageDialog(null,
                            "Soemething went wrong while fetching the data. Please try again later.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Cannt convert to json" + e);
                }

            } else {
                System.out.println("API fetching failed");
                //
                NotFound notFound = new NotFound();
                notFound.setVisible(true);
                notFound.setLocationRelativeTo(null); // Center the window
                notFound.setDefaultCloseOperation(NotFound.DISPOSE_ON_CLOSE);

            }

            // System.out.println(weatherData);

        } catch (UnirestException ex) {
            System.out.println("Error fetching weather data: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {

        WeatherAppProject weatherAppProject = new WeatherAppProject();
        weatherAppProject.start(weatherAppProject.city);

        // try {
        // WeatherData weatherData = new WeatherData();
        // String url = "https://api.openweathermap.org/data/2.5/weather?q=" + new
        // WeatherAppProject().city +
        // "+&appid=907e91122aea5cf6a934d1036ee644d1&units=metric";
        // System.out.println(url);
        // HttpResponse<String> response = Unirest.get(url)
        // .header("Content-Type", "application/json")
        // .asString();
        // ObjectMapper mapper = new ObjectMapper();
        // if (response.getStatus() == 200) {
        // String responseBody = response.getBody();
        // try {
        // weatherData = mapper.readValue(responseBody, WeatherData.class);
        // } catch (Exception e) {
        // System.out.println("Cannt convert to json" + e);
        // }
        // } else {
        // System.out.println("API fetching failed");
        // }
        // WeatherDIsplay wdi = new WeatherDIsplay(weatherData);
        // wdi.setVisible(true);
        // // System.out.println(weatherData);
        // } catch (UnirestException ex) {
        // Logger.getLogger(WeatherAppProject.class.getName()).log(Level.SEVERE, null,
        // ex);
        // }
    }
}
