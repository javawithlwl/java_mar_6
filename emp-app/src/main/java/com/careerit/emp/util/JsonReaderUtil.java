package com.careerit.emp.util;

import com.careerit.emp.domain.Currency;
import com.careerit.emp.domain.Employee;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class JsonReaderUtil {

  private JsonReaderUtil() {

  }

  public static List<Employee> loadEmployeeDetails() {
    ObjectMapper objectMapper = new ObjectMapper();
    TypeReference<List<Employee>> type = new TypeReference<List<Employee>>() {
    };
    try {
      return objectMapper.readValue(JsonReaderUtil.class.getResourceAsStream("/emp-data.json"), type);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static Map<String, Currency> loadCurrencyDetails() {
    ObjectMapper objectMapper = new ObjectMapper();
    TypeReference<Map<String, Currency>> type = new TypeReference<>() {
    };
    try {
      return objectMapper.readValue(JsonReaderUtil.class.getResourceAsStream("/common-currency.json"), type);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }


}
