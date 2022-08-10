package baseAbstraction;

// abstraction ada 2 type:
// 1. abstract class
// 2. interface
public abstract class RegisterAbstract {
  // tujuan: sebagai kerangka method -> menyembunyikan detail dari methodnya
  // abstrack method - wajib di-override pada subclass
  public abstract void regisUser(String username, String password);

  // non abstract method - optional di-override
  public void regisSuccess(String username) {
    System.out.println("Regis success");
  }
}
