package com.example.android.quakereport;

/**
 * Created by Aditya on 29-06-2017.
 */

public class Earthquake {

    // Variable to hold the magnitude of a quake
    private double magnitude;

    // Variable to hold the location of a quake
    private String location;

    // Variable to hold the time of the quake
    private long time;

    // Variable to hold the url
    private String url;

    /*
    * Create a new Earthquake object.
    *
    * @param vMagnitude is the magnitude of the quake (e.g. 7.2)
    * @param vLocation is the Location of the quake (e.g. Dhanbad)
    * @param vTime is time of the quake (e.g. 45316843315)
    * @param vUrl is the url for the detailed news (e.g. www.abc.com)
    * */
    public Earthquake(double vMagnitude, String vLocation, long vTime, String vUrl){
        magnitude = vMagnitude;
        location = vLocation;
        time = vTime;
        url = vUrl;
    }

    /*
    Get the Magnitude of the quake
     */
    public double getMagnitude(){
        return magnitude;
    }

    /*
    Get the Location of the quake
     */
    public String getLocation(){
        return location;
    }

    /*
    Get the time of the quake
     */
    public long getTime(){
        return time;
    }
    /*
    Get the url for the detailed news of the quake
     */
    public String getUrl(){
        return url;
    }

}
