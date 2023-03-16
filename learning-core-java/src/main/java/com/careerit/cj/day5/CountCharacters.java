package com.careerit.cj.day5;

public class CountCharacters {

  public static void main(String[] args) {

        String name = "i am learning core java";
        int vcount = 0;
        int ocount = 0;
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            switch (ch){
              case 'a':
              case 'e':
              case 'i':
              case 'o':
              case 'u':
                       vcount++;
                       break;
              default: ocount++;
            }
        }
    System.out.println("Total "+vcount+" vowels are there in \""+name+"\"");


  }
}
