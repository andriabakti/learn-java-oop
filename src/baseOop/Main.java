package baseOop;

public class Main {
  public static void main(String[] args) {
    // Instance Object
    Person person = new Person();
    person.setFirstName("Chiyoko");
    person.setLastName("Reito");
    person.setBirthYear(2000);

    person.getDetail();
    System.out.println(person);

    person = new Person("Terra", "Firma", 1999);

    person.getDetail();
    System.out.println(person);
  }
}
