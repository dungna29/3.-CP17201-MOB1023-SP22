/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_ON_TAP_JAVA1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
//Code các chức năng CRUD đối tượng
public class SinhVienService implements ISinhVienService {

  Scanner _sc = new Scanner(System.in);
  List<SinhVien> _lstSinhViens;
  Utilities _utilities = new Utilities();
  SinhVien _sinhVien;
  String _input;

  public SinhVienService() {
    _lstSinhViens = new ArrayList<>();
    fake5SV();
  }

  private void fake5SV() {
    _lstSinhViens.add(new SinhVien("dungnaPH001", "JAVA", 1, "Nguyễn Anh Dũng", "01234756"));
    _lstSinhViens.add(new SinhVien("dungnmPH002", "JAVA", 2, "Nguyễn Mạnh Dũng", "01234756"));
    _lstSinhViens.add(new SinhVien("dungnhPH003", "JAVA", 3, "Nguyễn Hoàng Dũng", "01234756"));
    _lstSinhViens.add(new SinhVien("namnaPH004", "JAVA", 4, "Nguyễn Anh Nam", "01234756"));
    _lstSinhViens.add(new SinhVien("dungnaPH005", "JAVA", 5, "Nguyễn Anh Dũng", "01234756"));
  }

  @Override
  public String add() {
    System.out.print("Mời bạn nhập số lượng: ");
    _input = _sc.nextLine();
    for (int i = 0; i < Integer.parseInt(_input); i++) {
      _sinhVien = new SinhVien();
      _sinhVien.setId(getMaxID());//Tạo 1 khóa ID tự sinh
      System.out.println("Mời bạn nhập tên: ");
      _sinhVien.setTen(_utilities.vietHoaFullname(_sc.nextLine()));
      String tempsdt;
      do {
        System.out.println("Mời bạn nhập sdt: ");
        tempsdt = _sc.nextLine();
      } while (!_utilities.checkSo(tempsdt));//Check số khi nhập
      _sinhVien.setSdt(tempsdt);
      _sinhVien.setMsv(_utilities.getMa(_sinhVien.getTen(), _sinhVien.getId(), 0));
      //Mã sinh viên tự sinh các bạn nên viết ở bên _utilities không nên bắt người dùng nhập vào
      System.out.println("Chọn ngành ");
      System.out.println("1. JAVA");
      System.out.println("2. C#");
      System.out.println("Mời bạn chọn: ");
      String tempNganh = _sc.nextLine();
      _sinhVien.setNganhHoc(tempNganh.equals("1") ? "JAVA" : "C#");
      _lstSinhViens.add(_sinhVien);
    }
    return "Thêm thành công";
  }

  @Override
  public String edit() {
    var temp = getIndexByID(Integer.parseInt(getInputValue("id")));
    if (temp == -1) {
      return "Không tìm thấy";
    }
    System.out.println("Mời bạn nhập tên: ");
    _lstSinhViens.get(temp).setTen(_utilities.vietHoaFullname(_sc.nextLine()));
    String tempsdt;
    do {
      System.out.println("Mời bạn nhập sdt: ");
      tempsdt = _sc.nextLine();
    } while (!_utilities.checkSo(tempsdt));//Check số khi nhập
    _lstSinhViens.get(temp).setSdt(tempsdt);
    System.out.println("Chọn ngành ");
    System.out.println("1. JAVA");
    System.out.println("2. C#");
    System.out.println("Mời bạn chọn: ");
    String tempNganh = _sc.nextLine();
    _lstSinhViens.get(temp).setNganhHoc(tempNganh.equals("1") ? "JAVA" : "C#");
    return "Sửa thành công";
  }

  @Override
  public String delete() {
    var temp = getIndexByID(Integer.parseInt(getInputValue("id")));
    if (temp == -1) {
      return "Không tìm thấy";
    }
    _lstSinhViens.remove(temp);
    return "Đã tìm thấy";
  }

  @Override
  public String find() {
    var temp = getIndexByID(Integer.parseInt(getInputValue("id")));
    if (temp == -1) {
      return "Không tìm thấy";
    }
    _lstSinhViens.get(temp).inRaManHinh();
    return "Đã tìm thấy";
  }

  @Override
  public void printLstSV() {
    for (SinhVien x : _lstSinhViens) {
      x.inRaManHinh();
    }
  }

  public int getIndexByID(int id) {
    for (int i = 0; i < _lstSinhViens.size(); i++) {
      if (_lstSinhViens.get(i).getId() == id) {
        return i;
      }
    }
    return -1;
  }

  public String getInputValue(String msg) {//Lấy giá trị người dùng nhập vào
    System.out.printf("Mời bạn nhập %s: ", msg);
    return _sc.nextLine();
  }

  public int getMaxID() {//Tìm ra khóa có số lớn nhất
    if (_lstSinhViens.isEmpty()) {
      return 1;
    }
    int max = _lstSinhViens.get(0).getId();
    for (SinhVien x : _lstSinhViens) {
      if (max < x.getId()) {
        max = x.getId();
      }
    }
    return max + 1;
  }
}
