package com.careerit.cj.day21;
public class Employee {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private double salary;
    
    public Employee(Long id, String firstName, String lastName, String email, String gender, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }
    
    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
                + ", gender=" + gender + ", salary=" + salary + "]";
    }
  
}
