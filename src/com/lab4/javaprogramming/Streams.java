package com.lab4.javaprogramming;
import java.nio.file.*;
import java.time.LocalTime;
import java.util.*;

public class Streams {

    public static void main(String[] args) {
        try {
            Path path = Paths.get("Trades.txt");
            if (Files.exists(path)) {

                List<String> data = Files.readAllLines(path);

                for(String s: data){
                    System.out.println(s);
                }

            } else {
                    System.out.println("File doesn't exist");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

