package com.careerit.cj.day7;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample {

  public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Krish");
        list.add("Miani");
        list.add("Alex");
        list.add("Tanvi");

        for(int i=0;i<list.size();i++){
          System.out.println(list.get(i));
        }
        for(String name:list){
          System.out.println(name);
        }

  }
}
