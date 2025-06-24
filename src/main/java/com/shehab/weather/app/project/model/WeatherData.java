package com.shehab.weather.app.project.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

import javax.swing.JOptionPane;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherData {
    private Coord coord;
    private Main main;
    private List<Weather> weather;
    private String visibility;
    private Wind wind;
    private Clouds clouds;
    private String dt;
    private Sys sys;
    private Long timezone;
    private String name;
    private Rain rain;
    private Integer cod;

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public Main getMain() {
        if (main == null) {
            main = new Main(); // Initialize main to avoid NullPointerException
        }
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public String getVisibility() {
        if (visibility == null) {
            visibility = "N/A"; // Default value if visibility is not set
        }
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        if (wind == null) {
            wind = new Wind(); // Initialize wind to avoid NullPointerException
        }
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        if (clouds == null) {
            clouds = new Clouds(); // Initialize clouds to avoid NullPointerException
        }
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public String getDt() {
        if (dt == null) {
            dt = "N/A"; // Default value if dt is not set
        }
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public Sys getSys() {
        if (sys == null) {
            sys = new Sys(); // Initialize sys to avoid NullPointerException
        }
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public Long getTimezone() {
        if (timezone == null) {
            JOptionPane.showMessageDialog(null,
                    "Timezone is not set. Defaulting to +0:00 UTC.",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            timezone = 0L; // Default value if timezone is not set
        }
        return timezone;
    }

    public void setTimezone(Long timezone) {
        this.timezone = timezone;
    }

    public String getName() {
        if (name == null) {
            name = "Unknown"; // Default value if name is not set
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCod() {
        if (cod == null) {
            cod = null; // Default value if cod is not set
        }
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public List<Weather> getWeather() {
        if (weather == null || weather.isEmpty()) {
            weather = List.of(new Weather()); // Initialize with a default Weather object to avoid NullPointerException
        }
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Rain getRain() {
        if (rain == null) {
            rain = new Rain(); // Initialize rain to avoid NullPointerException
        }
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    
    @Override
    public String toString() {
        return "WeatherData{" +
                " \ncoord=" + coord +
                ", \nmain=" + main +
                ", \nweather=" + weather +
                ", \nvisibility='" + visibility + '\'' +
                ", \nwind=" + wind +
                ", \nclouds=" + clouds +
                ", \ndt='" + dt + '\'' +
                ", \nsys=" + sys +
                ", \ntimezone=" + timezone +
                ", \nname='" + name + '\'' +
                ", \ncod=" + cod +
                '}';
    }
//
//    public Coord getCoord() {
//        return coord;
//    }
//
//    public void setCoord(Coord coord) {
//        this.coord = coord;
//    }
//
//    public Main getMain() {
//        return main;
//    }
//
//    public void setMain(Main main) {
//        this.main = main;
//    }
//
//    @Override
//    public String toString() {
//        return "WeatherData{" +
//                "\ncoord=" + coord +
//                ",\nmain=" + main +
//                '}';
//    }


    //    public static class Coord{
//        private String lon;
//        private String lat;
//
//        public String getLon() {
//            return lon;
//        }
//
//        public String getLat() {
//            return lat;
//        }
//
//        public void setLat(String lat) {
//            this.lat = lat;
//        }
//
//        public void setLon(String lon) {
//            this.lon = lon;
//        }
//
//        @Override
//        public String toString() {
//            return "Coord{" +
//                    "lon=" + lon +
//                    ", lat=" + lat +
//                    '}';
//        }
//    }

}
