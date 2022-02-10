/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_CRUD_SINHVIEN;

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
  }

  @Override
  public void fake5SV() {
    _lstSinhViens.add(new SinhVien("dungnaPH001", "JAVA", 1, 1, "Nguyễn Anh Dũng", "01234756"));
    _lstSinhViens.add(new SinhVien("dungnmPH002", "JAVA", 0, 2, "Trượt Mạnh Dũng", "01234756"));
    _lstSinhViens.add(new SinhVien("dungnhPH003", "C#", 1, 3, "Lâm Hoàng Dũng", "01234756"));
    _lstSinhViens.add(new SinhVien("namnaPH004", "C#", 1, 4, "Tống Anh Nam", "01234756"));
    _lstSinhViens.add(new SinhVien("dungnaPH005", "JAVA", 1, 5, "Lê Anh Dũng", "01234756"));
  }

  @Override
  public String add(SinhVien sv) {
    if (sv == null) {
      return "Thêm thất bại";
    }
    _lstSinhViens.add(sv);
    return "Thêm thành công";
  }

  @Override
  public String edit(SinhVien sv) {
     
    var temp = getIndexByID(sv.getId());
    if (temp == -1) {
      return "Không tìm thấy";
    }
    _lstSinhViens.get(temp).setTen(_utilities.vietHoaFullname(sv.getTen()));
    _lstSinhViens.get(temp).setMsv(_utilities.getMa(sv.getTen(), getMaxID(), 0));
    _lstSinhViens.get(temp).setSdt(sv.getSdt());
    _lstSinhViens.get(temp).setNganhHoc(sv.getNganhHoc());
    return "Sửa thành công";
  }

  @Override
  public String delete(int id) {
     
    var temp = getIndexByID(id);
    if (temp == -1) {
      return "Không tìm thấy";
    }
    _lstSinhViens.remove(temp);
    return "Đã tìm thấy";
  }

  @Override
  public List<SinhVien> find(String text) {//Tìm kiếm gần đúng theo 2 điều kiện
    var lstSVTemp = new ArrayList<SinhVien>();
    for (SinhVien x : _lstSinhViens) {
      if (x.getMsv().toLowerCase().startsWith(text.toLowerCase()) || x.getTen().toLowerCase().startsWith(text.toLowerCase())) {
        lstSVTemp.add(x);
      }
    }
    return lstSVTemp;
  }

  @Override
  public List<SinhVien> getlstSinhVien() {
    return _lstSinhViens;
  }

  public int getIndexByID(int id) {
    for (int i = 0; i < _lstSinhViens.size(); i++) {
      if (_lstSinhViens.get(i).getId() == id) {
        return i;
      }
    }
    return -1;
  }

  public int getMaxID() {//Tìm ra khóa có số lớn nhất
//    if (_lstSinhViens.isEmpty()) {
//      return 1;
//    }
    try {
      int max = _lstSinhViens.get(0).getId();
      for (SinhVien x : _lstSinhViens) {
        if (max < x.getId()) {
          max = x.getId();
        }
      }
      return max + 1;
    } catch (Exception e) {
      return 1;
    }
  }

}
