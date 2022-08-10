package baseInheritance;

import baseOop.Person;

public class Student extends Person {
  // attributes
  private int sks;
  private String mataKuliah;

  // constructor
  public Student(int sks, String mataKuliah) {
    this.sks = sks;
    this.mataKuliah = mataKuliah;
  }

  public Student() {
  }

  // setter - getter
  public void setSks(int sks) {
    this.sks = sks;
  }

  public int getSks() {
    return sks;
  }

  public void setMataKuliah(String mataKuliah) {
    this.mataKuliah = mataKuliah;
  }

  public String getMataKuliah() {
    return mataKuliah;
  }

  // other methods
  public int hitungMataKuliah(String mataKuliah) {
    return this.sks++;
  }

  // override method
  @Override
  public String getFullName() {
    if (getSks() >= 3) {
      return super.getFullName() + ", ST";
    }
    return super.getLastName();
    // return "methods from student";
  }
}
