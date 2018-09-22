package com.example.android.sunshine.data.database;

import java.util.Date;

public class ListWeatherEntry {

    private int id;
    private int weatherIconId;
    private Date date;
    private double min;
    private double max;
    public ListWeatherEntry(int id, int weatherIconId, Date date, double min, double max) {
        this.id = id;
        this.weatherIconId = weatherIconId;
        this.date = date;
        this.min = min;
        this.max = max;
    }
    public int getId() {
        return id;
    }
    public int getWeatherIconId() {
        return weatherIconId;
    }
    public Date getDate() {
        return date;
    }
    public double getMin() {
        return min;
    }
    public double getMax() {
        return max;
    }
}
