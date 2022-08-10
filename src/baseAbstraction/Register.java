package baseAbstraction;

public class Register extends RegisterAbstract {

  @Override
  public void regisUser(String username, String password) {
    System.out.println(username + " created!");
  }
}
