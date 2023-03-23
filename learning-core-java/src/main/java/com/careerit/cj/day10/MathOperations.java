package com.careerit.cj.day10;

import java.util.ArrayList;
import java.util.List;

public class MathOperations {

  public List<Integer> generatePrime(int lb, int ub) {
        List<Integer> list = new ArrayList<>();
        for(int i=lb;i<=ub;i++){
            if(isPrime(i)){
              list.add(i);
            }
        }
        return list;
  }
  public List<Integer> getIds(String data){
      // "1001,1010,1020,1050,1060"
     String[] arr = data.split(",");
     List<Integer> list = new ArrayList<>();
     for(String idStr:arr){
        int id = Integer.parseInt(idStr);
        list.add(id);
     }
     return list;
  }


  public List<Integer> generatePrime(int n){
    List<Integer> list = new ArrayList<>();
    int i=2;
    while(list.size()!=n){
        if(isPrime(i)){
          list.add(i);
        }
        i++;
    }
    return list;
  }

  private boolean isPrime(int num) {
    if (num < 2 || (num % 2 == 0 && num != 2)) {
      return false;
    }
    for (int i = 2; i <= num / 2; i++) {
         if(num % i == 0){
           return false;
         }
    }
    return true;
  }

}
