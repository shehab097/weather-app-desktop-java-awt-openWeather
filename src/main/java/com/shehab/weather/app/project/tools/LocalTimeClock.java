/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shehab.weather.app.project.tools;

import java.time.Clock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sheha
 */
public class LocalTimeClock {
    
    public static void getCurrentTime(){
        
        String t = "";
        while (true) {            
            try {
                t = UnitConverter.unixToHHMMSS(Clock.systemUTC().millis()/1000, 0);
                Thread.sleep(1000);
                System.out.println(t);
            } catch (InterruptedException ex) {
                Logger.getLogger(LocalTimeClock.class.getName()).log(Level.SEVERE, null, ex);
                return;
            }
        }
    }
    
    public static void main(String[] args) {
       
        getCurrentTime();
    }
}
