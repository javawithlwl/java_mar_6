package com.careerit.cj.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ContactApplication {

    private static final String CREATE_TABLE = "create table contact(id int,name varchar(100),email varchar(100),mobile varchar(10));";
    private static final String ADD_CONTACT="insert into contact(id,name,email,mobile) values(?,?,?,?);";
  public static void main(String[] args) {
        //createTable();
    Contact contact = Contact.builder().id(1001).name("Krish").email("krish.t@gmail.com").mobile("9876543210")
        .build();
    addContact(contact);
  }
    private static void createTable(){
      Connection con = null;
      Statement st = null;
      try{
          con = ConnectionUtil.getConnection();
          st = con.createStatement();
          st.execute(CREATE_TABLE);
      }catch (SQLException e){
          e.printStackTrace();
      }finally {
          ConnectionUtil.close(st,con);
      }
    }
    private static void addContact(Contact contact){
      Connection con = null;
      PreparedStatement pst = null;
      try{
        con = ConnectionUtil.getConnection();
        pst = con.prepareStatement(ADD_CONTACT);
        pst.setInt(1,contact.getId());
        pst.setString(2,contact.getName());
        pst.setString(3,contact.getEmail());
        pst.setString(4,contact.getMobile());
        int count = pst.executeUpdate();
        System.out.println("Total "+count+" contact(s) are added");
      }catch (SQLException e){
        e.printStackTrace();
      }finally {
        ConnectionUtil.close(pst,con);
      }
    }
    private static void deleteContact(int id){

    }
    private static void showContacts(){

    }
    private static void update(Contact contact){

    }
    private static void showContact(int id){

    }

}
