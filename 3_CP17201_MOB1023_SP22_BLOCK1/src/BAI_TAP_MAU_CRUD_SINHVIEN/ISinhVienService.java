/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_CRUD_SINHVIEN;

import java.util.List;

/**
 *
 * @author Dungna89
 */
public interface ISinhVienService {

  public String add(SinhVien sv);//Thêm mới sinh viên

  public String edit(SinhVien sv);//Sửa sinh viên

  public String delete(int id);//Xóa sinh viên

  public List<SinhVien> find(String text);//Tìm kiếm gần đúng

  public List<SinhVien> getlstSinhVien();//Lấy danh sáhc

  public void fake5SV();//Tạo 5 sinh viên

  public int getMaxID();
}
