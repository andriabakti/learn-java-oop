package baseAbstraction.service;

public class RegisterServiceImpl implements RegisterService {

  @Override
  public void registerUser(String fullName, String password) {
    System.out.println(fullName + " is created!");
  }

  @Override
  public void payment(String fullName) {
    RegisterService.super.payment(fullName);
  }
}
