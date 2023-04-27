package com.careerit.cj.other;

import java.util.HashMap;
import java.util.Map;

public class PartialUpdate {
  public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1001);
        employee.setName("Krish");
        employee.setSalary(56000);
        employee.setLocation("NEW YORK");
        employee.setDept("IT");
        Map<String,Object> map = new HashMap<>();
        map.put("dept","SALES");
        map.put("salary",70000);
        Employee updateValues = updateEmployee(employee,map);
    }
    public static Employee updateEmployee(Employee employee, Map<String,Object> map){
      // Logic update employee object with updated fields
      return employee;
  }
}
