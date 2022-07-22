package assignment.biodata.service;

import java.util.UUID;

public class StudentInterfaceImpl extends StudentInterface {

  @Override
  public void studentRegistration(String fullname, UUID cardIdentity) {
    System.out.println(fullname + " telah terdaftar dengan ID: " + cardIdentity);
  }

  @Override
  public void learningPlan(String mataKuliah, int sks, String ruangan) {

  }

}
