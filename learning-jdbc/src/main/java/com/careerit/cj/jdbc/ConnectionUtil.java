package com.careerit.cj.jdbc;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public final class ConnectionUtil {
  private static Properties properties;

  private ConnectionUtil() {
  }

  static {
    properties = new Properties();
    try {
      properties.load(ConnectionUtil.class.getResourceAsStream("/db.properties"));
    } catch (IOException e) {
      System.out.println("While loading properties ");
      e.printStackTrace();
    }
  }

  public static Connection getConnection() {
    Connection con = null;
    try {
      con = DriverManager.getConnection(properties.getProperty("db.url"),
          properties.getProperty("db.username"),
          properties.getProperty("db.password"));
    } catch (SQLException e) {
      System.out.println("While connecting with db :" + e);
    }
    return con;
  }

  public static void close(ResultSet rs, Statement st, Connection con) {
    try {
      if (rs != null) {
        rs.close();
      }
      if (st != null) {
        st.close();
      }
      if (con != null) {
        con.close();
      }
    } catch (SQLException e) {
      System.out.println("While closing resources :" + e);
    }
  }

  public static void close(Statement st, Connection con) {
    close(null, st, con);
  }
}
