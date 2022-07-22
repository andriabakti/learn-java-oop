package assignment.biodata.service;

import java.util.UUID;

public abstract class StudentInterface {
  public abstract void studentRegistration(String fullname, UUID cardIdentity);

  public abstract void learningPlan(String mataKuliah, int sks, String ruangan);
}
