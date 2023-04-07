package com.careerit.cj.day21;


import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

  public static void main(String[] args) {
    List<Employee> list = loadFromFile();
    // Get the employee full name => firstName + " " + lastName
    List<String> fullNamesList = getFullNames(list);
    System.out.println(fullNamesList);


  }

  private static List<String> getFullNames(List<Employee> employeeList) {
    List<String> list = new ArrayList<>();
    for (Employee emp : employeeList) {
      String fullName = emp.getFirstName() + " " + emp.getLastName();
      list.add(fullName);
    }
    return list;
  }

  private static List<Employee> loadFromFile() {

    List<Employee> empList = new ArrayList<>();
    try {
      URL url = EmployeeManager.class.getResource("/employee.csv");
      List<String> list = Files.readAllLines(Paths.get(url.toURI()));
      for (int i = 1; i < list.size(); i++) {
        String data = list.get(i);
        String[] arr = data.split(",");
        Employee emp = convertRowToEmp(arr);
        empList.add(emp);
      }
    } catch (IOException | URISyntaxException e) {
      e.printStackTrace();
      System.out.println(e);
    }
    return empList;

  }

  private static Employee convertRowToEmp(String[] arr) {
    Long id = Long.parseLong(arr[0]);
    String firstName = arr[1];
    String lastName = arr[2];
    String email = arr[3];
    String gender = arr[4];
    double salary = Double.parseDouble(arr[5]);
    return new Employee(id, firstName, lastName, email, gender, salary);
  }


}
