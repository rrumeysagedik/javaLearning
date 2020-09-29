package com.example.javalearning;

public class Loops {

    public static void main(String[] args) {

        //for loop

        //döngüler belli bir veri koleksiyonu içerisinde aynı işlemi devamlı yapma olanağı sağlayan metodlardır.

        int[] myNumbers={12,15,18,21,24};

       // System.out.println(x);
        for(int i=0; i<myNumbers.length; i++){

            int x=myNumbers[i] /3 * 5;
            //System.out.println(x);
        }

        for(int number: myNumbers){

            //System.out.println(number);
        }

            //while loop
        int j =0;

        while(j<10){

            System.out.println(j);
            j++;
        }

    }
}
