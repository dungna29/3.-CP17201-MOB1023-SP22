/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_ON_TAP_JAVA1;

import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class Main {//GUI

  /*
    Quản lý sinh viên và giảng viên
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String choice;
    while (true) {
      System.out.println("Quản lý Sinh Viên và Giảng Viên");
      System.out.println("1. Quản lý Sinh Viên");
      System.out.println("2. Quản lý Giảng Viên");
      System.out.println("3. Thoát");
      System.out.println("Mời bạn chọn chức năng: ");
      choice = sc.nextLine();
      switch (choice) {
        case "1":
          do {
            System.out.println("1. Thêm");
            System.out.println("2. Sửa");
            System.out.println("3. Xóa");
            System.out.println("4. In DS");
            System.out.println("5. Tìm Kiếm");
            System.out.println("6. Thoát");
            System.out.println("Mời bạn chọn chức năng: ");
            choice = sc.nextLine();
          } while (!choice.equals("6"));

          break;
        case "2":

          break;
        case "3":

          break;
        default:
          System.out.println("Chức năng không tồn tại");
      }
    }
  }
}
