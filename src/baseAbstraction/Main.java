package baseAbstraction;

import java.util.Scanner;

import baseAbstraction.service.RegisterServiceImpl;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Register register = new Register();

    System.out.print("Username: ");
    String username = sc.nextLine();
    System.out.print("Fullname: ");
    String fullName = sc.nextLine();

    register.regisUser(username, "123");
    register.regisSuccess(username);

    RegisterServiceImpl serviceImpl = new RegisterServiceImpl();
    serviceImpl.registerUser(fullName, "password");
    serviceImpl.payment(fullName);
    sc.close();
  }
}
