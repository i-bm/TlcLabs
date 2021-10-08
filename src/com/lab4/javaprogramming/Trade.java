package com.lab4.javaprogramming;
import java.time.LocalTime;

public class Trade {

    private long duration = 37200003; //Milliseconds since midnight
    private long milliseconds = duration % 1000;
    private long seconds = (duration/1000) % 60;
    private long minutes = (duration/(1000*60)) % 60;
    private long hour = (duration/(1000*60*60)) % 24;
}
