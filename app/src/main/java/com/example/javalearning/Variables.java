package com.example.javalearning;

public class Variables {

//metodlar istediğimiz zaman çalıştırabileceğimiz kod bloklarıdır.

      public static void main(String[] args){

          //Variables(Değişkenler)
            //integer-Long
          int age=20;
          System.out.println(10*age);
          System.out.println(age/5);

          //double-float

          double a=5.00;
          double b=11.00;
          System.out.println(b/a);

          double pi=3.14;
          int r =5;
          System.out.println(2*r*pi);

          //String

          String name="rumi";
          String surname="gedik";

          System.out.println(name+surname);

            //boolean

          boolean isAlive=true;
          isAlive=false;
          System.out.println(isAlive);


          //Final kodun değerinin başka yerde değişmesini istemiyorsam Final demem yeterli yani o bir sabit oluyor artık.
          // final int myİnteger=5;

      }

}
