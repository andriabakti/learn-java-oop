package baseAbstraction.service;

public interface RegisterService {
  // wajib di-override
  public void registerUser(String fullName, String password);

  // optional
  default void payment(String fullName) {
    System.out.println("Payment from " + fullName);
  }
}
