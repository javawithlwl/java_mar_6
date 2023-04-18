package com.careerit.cj.day22;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person{
    private String name;
    public Person(String name){
      this.name = name;
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Person person)) return false;
    return Objects.equals(name, person.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return name;
  }
}

public class SetExample {
  public static void main(String[] args) {
      Set<Integer> set = new HashSet<>();
      set.add(1);
      set.add(8);
      set.add(2);
      set.add(3);
      set.add(1);
      set.add(2);
      set.add(5);
      set.add(9);

    System.out.println(set);

    Set<Person> persons = new HashSet<>();
    persons.add(new Person("Krish"));
    persons.add(new Person("Krish"));
    persons.add(new Person("Krish"));
    persons.add(new Person("Krish"));
    persons.add(new Person("Krish"));
    System.out.println(persons.size());


  }
}
