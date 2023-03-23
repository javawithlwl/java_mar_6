package com.careerit.cj.day9;

public class Product {

      private int pid;
      private String name;
      private double price;

      public Product(int pid,String name,double price){
            this.pid = pid;
            this.name = name;
            this.price = price;
      }

      public void discount(int percentage){
             this.price = this.price - (this.price * percentage/(float)100);
      }
      public void showDetails(){
            String info = String.format("%s,%s,%s",pid,name,price);
            System.out.println(info);
      }

      public int getPid() {
            return pid;
      }

      public void setPid(int pid) {
            this.pid = pid;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public double getPrice() {
            return price;
      }

      public void setPrice(double price) {
            //Validation
            this.price = price;
      }
}
