package com.careerit.cj.jdbc;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Manager {

  public static void main(String[] args) throws IOException {

    Properties pros = new Properties();
    pros.load(Manager.class.getResourceAsStream("/db.properties"));

    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    try {
      con = DriverManager.getConnection(pros.getProperty("db.url"), pros.getProperty("db.username"), pros.getProperty("db.password"));
      st = con.createStatement();
      rs = st.executeQuery("select name,role,amount from player");
      while (rs.next()) {
        String name = rs.getString("name");
        String role = rs.getString("role");
        double amount = rs.getDouble("amount");
        System.out.println(name + "," + role + "," + amount);

      }
    } catch (SQLException e) {
      e.printStackTrace();
    }finally{
        try{
          if(rs != null)
            rs.close();
          if(st!=null)
            st.close();
          if(con!=null)
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

  }
}
