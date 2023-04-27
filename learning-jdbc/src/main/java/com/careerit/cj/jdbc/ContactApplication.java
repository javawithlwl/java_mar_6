package com.careerit.cj.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContactApplication {

  private static final String CREATE_TABLE = "create table contact(id int,name varchar(100),email varchar(100),mobile varchar(10));";
  private static final String ADD_CONTACT = "insert into contact(id,name,email,mobile) values(?,?,?,?);";
  private static final String GET_ALL_CONTACT = "select id,name,email,mobile from contact";
  private static final String DELETE_CONTACT = "delete from contact where id=?";
  private static final String UPDATE_CONTACT = "update contact set name=?,email=?,mobile=? where id=?";
  private static final String GET_CONTACT_BY_ID = "select id,name,email,mobile from contact where id=?";
  public static void main(String[] args) {
    //createTable();
//    Contact contact = Contact.builder().id(1002).name("Manoj").email("manoj.pvn@gmail.com").mobile("9876543211")
//        .build();
//    addContact(contact);
//    showContacts();
//    System.out.println("-".repeat(100));
//    deleteContact(1001);
//    System.out.println("-".repeat(100));
//    showContacts();
//    Contact toUpdateContact = Contact.builder().id(1002)
//        .name("Manoj Kumar")
//        .email("manoj.pvn@gmail.com")
//        .mobile("8876543211")
//       .build();
//    update(toUpdateContact);
    showContacts();
    showContact(1002);
    showContact(1009);
  }

  private static void createTable() {
    Connection con = null;
    Statement st = null;
    try {
      con = ConnectionUtil.getConnection();
      st = con.createStatement();
      st.execute(CREATE_TABLE);
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      ConnectionUtil.close(st, con);
    }
  }

  private static void addContact(Contact contact) {
    Connection con = null;
    PreparedStatement pst = null;
    try {
      con = ConnectionUtil.getConnection();
      pst = con.prepareStatement(ADD_CONTACT);
      pst.setInt(1, contact.getId());
      pst.setString(2, contact.getName());
      pst.setString(3, contact.getEmail());
      pst.setString(4, contact.getMobile());
      int count = pst.executeUpdate();
      System.out.println("Total " + count + " contact(s) are added");
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      ConnectionUtil.close(pst, con);
    }
  }

  private static void deleteContact(int id) {
        Connection con = null;
        PreparedStatement pst = null;
        try{
            con = ConnectionUtil.getConnection();
            pst = con.prepareStatement(DELETE_CONTACT);
            pst.setInt(1,id);
            int count = pst.executeUpdate();
            if(count!=0){
              System.out.println("Contact with id "+id+" is deleted");
            }else{
              System.out.println("Contact is not found for the given id "+id);
            }
        }catch (SQLException e){
          e.printStackTrace();
        }finally{
            ConnectionUtil.close(pst,con);
        }
  }

  private static void showContacts() {
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    try {
      con = ConnectionUtil.getConnection();
      st = con.createStatement();
      rs = st.executeQuery(GET_ALL_CONTACT);
      List<Contact> list = new ArrayList<>();
      while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String email= rs.getString("email");
            String mobile = rs.getString("mobile");
            Contact contact = Contact.builder().id(id).name(name).email(email).mobile(mobile).build();
            list.add(contact);
      }
      if(list.isEmpty()){
        System.out.println("Contact list is empty");
      }else{
          for(Contact contact:list){
            System.out.println(contact);
          }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      ConnectionUtil.close(rs, st, con);
    }

  }
  private static void update(Contact contact) {
    Connection con = null;
    PreparedStatement pst = null;
    try{
      con = ConnectionUtil.getConnection();
      pst = con.prepareStatement(UPDATE_CONTACT);
      pst.setString(1,contact.getName());
      pst.setString(2,contact.getEmail());
      pst.setString(3,contact.getMobile());
      pst.setInt(4,contact.getId());
      int count = pst.executeUpdate();
      if(count!=0){
        System.out.println("Contact with id "+contact.getId()+" is updated");
      }else{
        System.out.println("Contact is not found for the given id "+contact.getId());
      }
    }catch (SQLException e){
      e.printStackTrace();
    }finally{
      ConnectionUtil.close(pst,con);
    }
  }

  private static void showContact(int cid) {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    try {
      con = ConnectionUtil.getConnection();
      pst = con.prepareStatement(GET_CONTACT_BY_ID);
      pst.setInt(1,cid);
      rs = pst.executeQuery();
      if(rs.next()){
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String email= rs.getString("email");
        String mobile = rs.getString("mobile");
        Contact contact = Contact.builder().id(id).name(name).email(email).mobile(mobile).build();
        System.out.println(contact);
      }else{
        System.out.println("Contact is not for given id "+cid);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      ConnectionUtil.close(rs, pst, con);
    }

  }

}
