package baseInheritance;

import baseOop.Person;

public class Main {
  public static void main(String[] args) {
    // instance object person & student
    Person person = new Person();
    Student student = new Student();
    // bisa di-instance
    // Person newPerson = new Student();
    // tidak bisa di-instance
    // Student newStudent = new Person();

    person.setFirstName("Reza");
    person.setLastName("Rahardian");
    System.out.println(person.getFullName());

    student.setFirstName("Ayunda");
    student.setLastName("Risu");
    student.hitungMataKuliah("Aljabar Linear");
    student.hitungMataKuliah("Algoritma");
    student.hitungMataKuliah("Dasar-dasar Pemrograman");
    student.hitungMataKuliah("Dasar-dasar Pemrograman 2");
    System.out.println(student.getFullName());
  }
}
