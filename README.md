﻿# Weather App Desktop (Java AWT + OpenWeather)

A simple desktop weather application built with Java AWT, utilizing the OpenWeather API.

---

## Features

- Fetches real-time weather data using OpenWeather API
- Simple and intuitive user interface
- Cross-platform support (Windows, macOS, Linux)

---

## Fixed

- [ ] Program crash when space is entered in the city name field
- [ ] Closing the app with the close button now works correctly

[//]: # (- [ ] Package as JAR or EXE for easy distribution)

---

## How to Run

1. **Install Git**  
    Download and install [Git](https://git-scm.com/downloads) if you don't have it.

2. **Install Git**  
    Create a folder and right click then **open in terminal**

3. **Clone the Repository**  
    Open a terminal and run:
    ```sh
    git clone https://github.com/shehab097/weather-app-desktop-java-awt-openWeather.git
    ```

4. **Open the Project**  
    - Launch [IntelliJ IDEA](https://www.jetbrains.com/idea/) or your preferred Java IDE.
    - Open the cloned project folder.

5. **Update api key**  
    - Enter your api key form [https://openweathermap.org/](https://openweathermap.org/).
    ```java
    String url = "https://api.openweathermap.org/data/2.5/weather?q=" + cityName + "+&appid=YOUR_API_KEY&units=metric";
    ```

6. **Run the Application**  
    - Locate the main class (`WeatherAppProject.java`).
    - Right-click and select **Run**.

---
<!-- ---

## Notes

- You will need an [OpenWeather API key](https://openweathermap.org/api) to use the app. Add your API key as instructed in the code or configuration file.
- For packaging as a JAR or EXE, refer to your IDE's export options or use build tools like Maven or Gradle.

--- -->
