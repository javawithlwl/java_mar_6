package com.careerit.cj.day2;

public class Questions {

  public static void main(String[] args) {

        boolean a = true,b=false,c=true;

        if(a == true || (b=true) == true || (c=false)==false){}
        System.out.println(a+" "+b+" "+c);

        if( (2+5) > 5){
            if((3+5) > 8){
              System.out.println("1");
            }else{
              System.out.println("2");
            }
        }
        System.out.println("3");

  }
}
