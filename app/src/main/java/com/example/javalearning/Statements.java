package com.example.javalearning;

public class Statements {


    public static void main(String[] args) {
        //if statements

        int x = 3;
        int y = 20;
        int z = 5;

        if (x > y) {
            System.out.println("x is bigger");
        } else if (y > x) {
            System.out.println("y is bigger");
        }

        int day = 1;
        String dayString = "";

      /*  if (day == 1) {
            dayString = "monday";
        } else if (day == 2) {
            dayString = "Tuesday";
        } else {
            dayString = "sunday";
        }
            */

        //switch
        //değiştirmek manasına geliyor.

        switch (day){
            case 1:
                dayString="monday";
            case 2:
                dayString="tuesday";

            default:
                dayString="sunday";
        }

        System.out.println(dayString);


    }
}
