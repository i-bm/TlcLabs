package com.lambda;

import java.util.ArrayList;
import java.util.Random;


public class Lambda {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random rand = new Random();
        for(int i=0; i < 10; i++){
            int intN = rand.nextInt(50);
            arr.add(intN);
        }

//        for(int n: arr){
//            System.out.print(n + ", ");
//        }
        arr.forEach(n -> {
           if( n % 2 != 0) System.out.println(n);
        }
        );
    }
}
