package com.careerit.cj.jdbc;

import java.sql.*;

public class JdbcConnectionExample {

  public static void main(String[] args) {
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    try {
      con = ConnectionUtil.getConnection();
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
    } finally {
        ConnectionUtil.close(rs,st,con);
    }
  }
}
