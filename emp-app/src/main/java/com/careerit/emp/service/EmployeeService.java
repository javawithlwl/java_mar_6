package com.careerit.emp.service;

import com.careerit.emp.domain.Currency;
import com.careerit.emp.domain.Employee;
import com.careerit.emp.dto.EmployeeDto;
import com.careerit.emp.util.JsonReaderUtil;
import org.apache.commons.collections4.CollectionUtils;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmployeeService {

      private List<Employee> employees;
      private Map<String, Currency> currencyMap;
      public EmployeeService(){
            this.employees = JsonReaderUtil.loadEmployeeDetails();
            this.currencyMap = JsonReaderUtil.loadCurrencyDetails();
      }
      public List<EmployeeDto> getEmployeeWithFormattedSalaries(){
             List<EmployeeDto> employeeDtos = new ArrayList<>();
             if(CollectionUtils.isNotEmpty(employees)){
                  for(Employee emp:employees){
                      Currency currency = currencyMap.getOrDefault(emp.getCurrency(),defaultCurrency());
                      EmployeeDto employeeDto = formatEmp(emp,currency);
                      employeeDtos.add(employeeDto);
                  }
             }else{
               System.out.println("Employee list is empty");
             }
             return employeeDtos;
      }

      private EmployeeDto formatEmp(Employee emp, Currency currency) {
            int decimalPlaces = currency.getDecimalDigits();
            String symbol = currency.getSymbol();
            double salary = emp.getSalary();
            String formattedSalary = String.format("%s %.2f",symbol,salary);
            return EmployeeDto.builder()
                .id(emp.getId())
                .currency(emp.getCurrency())
                .email(emp.getEmail())
                .firstName(emp.getFirstName())
                .lastName(emp.getLastName())
                .formattedSalary(formattedSalary)
                .gender(emp.getGender())
                .salary(emp.getSalary())
                .build();

      }
      private Currency defaultCurrency(){
            Currency currency = new Currency();
            currency.setSymbol("$");
            currency.setDecimalDigits(2);
            return currency;
      }


}
