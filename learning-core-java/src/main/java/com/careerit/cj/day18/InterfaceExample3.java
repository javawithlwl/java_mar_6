package com.careerit.cj.day18;

import java.util.ArrayList;
import java.util.List;

interface NumberOperations {

  public static double power(int n,int m){
      return pow(n,m);
  }
  private static double pow(int a,int b){
      return Math.pow(a,b);
  }
  boolean isPrime(int num);
  default List<Integer> primeInRange(int lb, int ub){
      List<Integer> list = new ArrayList<>();
      for(int i=lb;i<=ub;i++){
            if(isPrime(i)){
              list.add(i);
            }
        }
      return list;
  }
  default int primeCount(int lb,int ub){
        return primeInRange(lb,ub).size();
  }
  default List<Integer> prime(int n){
    return getPrimes(n);
  }

  private List<Integer> getPrimes(int n){
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

}

class NumberOperationsImpl implements NumberOperations {

  @Override
  public boolean isPrime(int num) {
    if (num < 2 || (num % 2 == 0 && num != 2)) {
      return false;
    }
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}

public class InterfaceExample3 {

  public static void main(String[] args) {
    NumberOperations obj = new NumberOperationsImpl();

  }
}
