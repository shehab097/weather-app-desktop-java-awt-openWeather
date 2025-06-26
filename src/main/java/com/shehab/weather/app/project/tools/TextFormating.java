package com.shehab.weather.app.project.tools;

public class TextFormating {

    // replace space by "%20"
    public static String removeSpaces(String text) {
        if (text == null || text.trim().isEmpty()) {
            return "%20";
        }
        return text.replace(" ", "%20");
    }

}
