package com.careerit.cj.day16;

import java.util.concurrent.ThreadLocalRandom;

class Greetings{

      void show(){
        System.out.println("Hi Greetings from Greetings class");
      }
}
class BirthdayGreetings extends  Greetings{
      void show(){
        System.out.println("Many many happy returns of the day");
      }
      void show(String name){
        System.out.println(String.format("Hi %s, \n\t Many many happy returns of the day",name));
      }
}
class SessionalGreetings extends  Greetings{
  void show(){
    System.out.println("Happy new year");
  }
  void show(String name,String message){
    System.out.println(String.format("Hi %s, \n\t %s",name,message));
  }
}

public class ShapeManager {

  public static void main(String[] args) {
         Greetings greetings = getGreeterObject();

         if(greetings instanceof  BirthdayGreetings obj){
              obj.show("Krish");
         }else if(greetings instanceof  SessionalGreetings obj){
              obj.show("Krish","Wish you happy Vijayadashami");
         }

  }
  private static Greetings getGreeterObject(){
        int num = ThreadLocalRandom.current().nextInt(1,200);
        return num % 2 == 0 ? new SessionalGreetings(): new BirthdayGreetings();
  }
}
