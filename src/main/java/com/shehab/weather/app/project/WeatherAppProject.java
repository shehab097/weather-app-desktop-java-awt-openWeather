/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.shehab.weather.app.project;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import com.shehab.weather.app.project.gui.NotFound;
import com.shehab.weather.app.project.model.WeatherData;
import com.shehab.weather.app.project.gui.WeatherDIsplay;
// import java.util.logging.Level;
// import java.util.logging.Logger;

import javax.swing.*;

public class WeatherAppProject {

    private String city = "dhaka";

    public WeatherAppProject() {
        city = "dhaka";
    }

    public void start(String cityName) {
        try {

            WeatherData weatherData = new WeatherData();

            String url = "https://api.openweathermap.org/data/2.5/weather?q=" + cityName
                    + "+&appid=YOUR_API_KEY&units=metric";

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
                    wdi.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

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
                notFound.setDefaultCloseOperation(NotFound.EXIT_ON_CLOSE);

            }

            // System.out.println(weatherData);

        } catch (UnirestException ex) {
            System.out.println("Error fetching weather data: " + ex.getMessage());
            JOptionPane.showMessageDialog(null,
                    "Error fetching weather data. Please check your internet connection or try again later.",
                    "Network Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {

        WeatherAppProject weatherAppProject = new WeatherAppProject();
        weatherAppProject.start(weatherAppProject.city);

    }
}
