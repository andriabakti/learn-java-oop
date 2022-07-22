package assignment.biodata;

import java.time.LocalDate;

public class Person {
  // Attributes
  private String firstName;
  private String lastName;
  private String address;
  private Integer birthYear;
  private Integer age;

  // Constructors
  public Person() {
  }

  public Person(String firstName, String lastName, String address, Integer birthYear) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.birthYear = birthYear;
  }

  // Methods
  public String getFullname() {
    return this.firstName + " " + this.lastName;
  }

  public Integer getAge() {
    LocalDate date = LocalDate.now();
    this.age = date.getYear() - this.birthYear;
    return this.age;
  }

  public void getPersonDetail() {
    System.out.println("======= BIODATA ANDA =======");
    System.out.println("Nama lengkap: " + this.firstName + " " + this.lastName);
    System.out.println("Domisili: " + this.address);
    System.out.println("Usia: " + getAge());
  }
}
