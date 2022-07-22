package assignment.biodata;

// import java.util.ArrayList;
import java.util.List;

public class Pendidikan extends Person {
  // Attributes
  private List<String> mataKuliah;
  private int sks;

  // Constructors
  public Pendidikan() {
  }

  public Pendidikan(List<String> mataKuliah) {
    this.mataKuliah = mataKuliah;
  }

  // Setters-Getters
  public List<String> getMataKuliah() {
    return mataKuliah;
  }

  public void setMataKuliah(List<String> mataKuliah) {
    this.mataKuliah = mataKuliah;
  }

  public int getSks() {
    return sks;
  }

  public void setSks(int sks) {
    this.sks = sks;
  }

  // Methods
  public int totalSks(List<String> mataKuliah) {
    return this.sks++;
  }

  @Override
  public String getFullname() {
    if (getSks() >= 144) {
      return super.getFullname() + ", S.Kom";
    }
    return super.getFullname();
  }

}
