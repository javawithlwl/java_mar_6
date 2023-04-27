package com.careerit.cj.other;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.reflect.FieldUtils;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;


class Container<T extends Number> {

  Object[] arr = new Object[3];
  int count = 0;

  public void add(T ele) {
    arr[count++] = ele;
  }

  public T get(int index) {
    if (index >= 0 && index < count) {
      return (T) arr[index];
    }
    throw new IndexOutOfBoundsException("Please check index");
  }

  public Object[] getElements() {
    Object[] tmp = new Object[count];
    System.arraycopy(arr, 0, tmp, 0, count);
    return tmp;
  }


}

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
class EmployeeDto{
  private int id;
  private String name;
}

public class GenericsExample {

  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.add("Hello");
    list.add("Hi");
    for (String ele : list) {
      System.out.println(ele.toUpperCase());
    }
    Container<Double> container = new Container<>();
    container.add(4.5);
    container.add(6.0);
    container.add(7.5);
    System.out.println(Arrays.toString(container.getElements()));

    Container<Integer> container1 = new Container<>();
    container1.add(2);
    container1.add(3);
    container1.add(5);
    System.out.println(Arrays.toString(container1.getElements()));
    Employee p = new Employee();
    p.setId(1001);
    p.setName("Sai");
    p.setSalary(55000);

    EmployeeDto pdto = convertObject(p,EmployeeDto.class);
    System.out.println(pdto);
    Map<String,Object> map = new HashMap<>();

    map.put("name","Yogi");
    map.put("id",1001);
    map.put("salary",12000);
    map.put("city","New York");
    map.put("price",45000);

    Employee emp = getObject(Employee.class,map);
    Product product = getObject(Product.class,map);
    System.out.println(emp);
    System.out.println(product);

  }
  public static <E> E getObject(Class<E> type,Map<String,Object> map){
    E obj=null;
    try {
      obj = type.getDeclaredConstructor().newInstance();
      Field[] fields = FieldUtils.getAllFields(type);
      for(Field field:fields){
          field.setAccessible(true);
          field.set(obj,map.getOrDefault(field.getName(),null));
      }
    } catch (InstantiationException e) {
      throw new RuntimeException(e);
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    } catch (InvocationTargetException e) {
      throw new RuntimeException(e);
    } catch (NoSuchMethodException e) {
      throw new RuntimeException(e);
    }
    return obj;
  }
  public static <E> E convertObject(Object obj, Class<E> type) {
    ObjectMapper om = new ObjectMapper();
    E ele = om.convertValue(obj, type);
    return ele;
  }

}
