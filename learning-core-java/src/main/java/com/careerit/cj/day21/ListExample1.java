package com.careerit.cj.day21;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

  public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1001);
        list.add(1010);
        list.add(1005);
        list.add(1008);
        list.add(1010);
        list.add(1010);

        System.out.println(list.get(2));
        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
          System.out.println(list.get(i));
        }

        for(Integer ele: list){
          System.out.println(ele);
        }


  }
}
