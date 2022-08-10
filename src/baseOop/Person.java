package baseOop;

public class Person {
  // attributes
  private String firstName;
  private String lastName;
  private int birthYear;

  // default constructor
  public Person() {
  }
  // custom constructor
  // overloading
  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  public Person(String firstName, String lastName, int birthYear) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthYear = birthYear;
  }

  // methods - setter & getter
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
  }

  public int getBirthYear() {
    return birthYear;
  }

  // other methods
  public String getFullName() {
    return this.firstName + " " + this.getLastName();
  }

  public void getDetail() {
    System.out.println("========== DETAIL ==========");
    System.out.println("Nama lengkap: " + getFullName());
    System.out.println("Tahun lahir: " + getBirthYear());
  }
}
