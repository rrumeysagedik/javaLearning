package com.example.javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {


    public static void main(String[] args) {
        //diziler birden çok veriyi bir arada tutmaya yarıyor.
        //arrays
        String[] myStringArray= new String[3];
        myStringArray[0]="james";
        myStringArray[1]="Lars";
        myStringArray[2]="kirk";

        System.out.println(myStringArray[1]);

        int[] myIntegerArray= new int[3];
        myIntegerArray[0]=40;
        myIntegerArray[1]=40;
        myIntegerArray[2]=40;

        System.out.println( myIntegerArray[1]);

        int[] myNumberArray={0,1,2,3,4,5,6,7,8};
        System.out.println(myNumberArray[3]);


        //lists

        ArrayList<String> myMusician= new ArrayList<>();
        myMusician.add("james");
        myMusician.add("Lars");
        myMusician.add(1,"locks");
        myMusician.add("Kirk");

        System.out.println(myMusician.get(0));
        System.out.println(myMusician.get(1));
        System.out.println(myMusician.get(2));
        System.out.println(myMusician.get(3));


        //set
        //Dizi gibi ama bir eleman dizi içerisinde bir defa yer alabiliyor. Mesela bir james ekledik başka james ekleyemiyoruz. Buna müsa etmiyor.

        HashSet<String> mySet = new HashSet<>();
        mySet.add("james");
        mySet.add("james");
        System.out.println(mySet.size());


        //HashMap
        //Key ve Value değerleri  ekleniyor parametre olarak nasıl ki dizide index değeriyle diziye ulaşıyorduk. Burada da kendi verdiğimiz Keyvalue ile ulaşıyoruz.

        HashMap<String,String> myHashMap = new HashMap<String, String>();
        myHashMap.put("name", "james");
        myHashMap.put("instrument","guitar");

        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("instrument"));


        //Asagida int'i Integer seklinde yazdık. Çünkü küçük yazınca primitive olmamasından kaynaklı bir hata veriyor.
        HashMap<String,Integer> mySecondHashMap= new HashMap<>();

        mySecondHashMap.put("Run", 200);
        mySecondHashMap.put("BasketBall",500);

        System.out.println(mySecondHashMap.get("Run"));
        System.out.println(mySecondHashMap.get("BasketBall"));

    }
}
