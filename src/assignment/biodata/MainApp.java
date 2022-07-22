package assignment.biodata;

import java.util.Scanner;
import java.util.UUID;

import assignment.biodata.service.StudentInterfaceImpl;

public class MainApp {
  Scanner in = new Scanner(System.in);
  Integer selected;
  String option;

  public void input() {
    System.out.println("Menu: ");
    System.out.println("1. Biodata");
    System.out.println("2. Mata Kuliah");
    System.out.print("Silahkan inputkan menu pilihan Anda: ");
    this.selected = in.nextInt();
  }

  public void output() {
    do {
      input();
      switch (this.selected) {
        case 1:
          System.out.print("Inputkan nama depan Anda: ");
          String firstName = in.next();
          System.out.print("Inputkan nama belakang Anda: ");
          String lastName = in.next();
          System.out.print("Inputkan kota domisili Anda: ");
          String address = in.next();
          System.out.print("Inputkan tanggal lahir Anda: ");
          Integer birthYear = in.nextInt();

          // Instance Objects
          StudentInterfaceImpl serviceImpl = new StudentInterfaceImpl();
          Person person = new Person(firstName, lastName, address, birthYear);

          String fullname = person.getFullname();
          UUID id = UUID.randomUUID();

          // Prints
          System.out.println();
          serviceImpl.studentRegistration(fullname, id);
          person.getPersonDetail();
          break;

        case 2:
          System.out.println("Pilihan yang Anda pilih belum tersedia");
          break;

        default:
          System.out.println("Pilihan yang Anda masukkan tidak tersedia");
          break;
      }
      System.out.println();
      System.out.print("Apakah Anda ingin menjalankan kembali program ini (Y/N)? ");
      this.option = in.next();
      System.out.println();
    } while (option.equals("Y") || option.equals("y"));
    System.out.println("Program selesai. Terima kasih!");
    // System.out.println();
  }

  public static void main(String[] args) {
    new MainApp().output();
  }
}
