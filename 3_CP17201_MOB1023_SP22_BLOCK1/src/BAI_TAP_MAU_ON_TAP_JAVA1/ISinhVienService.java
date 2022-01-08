/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_ON_TAP_JAVA1;

/**
 *
 * @author Dungna89
 */
public interface ISinhVienService {
  /*
    - Không thể sử dụng private trong interface
    - Các phương thức không có body code
  */
  public String add();//Thêm mới sinh viên
  public String edit();//Sửa sinh viên
  public String delete();//Xóa sinh viên
  public String find();//Tìm kiếm sinh viên
  void printLstSV();//Xuất ds
}
