package com.careerit.emp;

import com.careerit.emp.service.EmployeeService;

public class EmployeeManager {

  public static void main(String[] args) {

    EmployeeService empService = new EmployeeService();
    empService.getEmployeeWithFormattedSalaries().forEach(emp->{
      System.out.println(emp);
    });
  }
}
