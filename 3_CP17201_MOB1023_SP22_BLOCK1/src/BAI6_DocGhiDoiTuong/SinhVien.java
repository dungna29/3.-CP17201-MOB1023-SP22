/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI6_DocGhiDoiTuong;

import java.io.Serializable;



/**
 *
 * @author Dungna89
 */
//implements Serializable giúp quá trình ghi vào file các thuộc tính bên trong đối tượng sẽ được sắp xếp thứ tự và không bị xáo trộn dữ liệu
/*
Như đã nói ở trên java cung cấp cho chúng ta công cụ Serialization để giúp chuyển đổi các object (đối tượng) thành các dòng bytes, ở đó lưu trữ tất cả các dữ liệu của object như kiểu dữ liệu, giá trị các biến hay các methods.

Thông thường Serialization gồm 2 qua trình là Serializing và Deserializing, trong khi serializing giúp chuyển đổi object thành các dòng bytes thì ngược lại deserializing chuyển các dòng bytes đã được serializing thành objects với các dữ liệu được giữ nguyên.

Công việc trên được thực hiện độc lập bởi JVM, điều đó có nghĩa rằng một object được serializing ở nền tảng này mà vẫn có thể được deserializing ở nền tảng khác. Đặc điểm này cũng đã chứng minh slogan “Write once, Run anywhere” gắn liền với Java từ trước đến nay.
*/
public class SinhVien extends Nguoi implements Serializable{
  private String msv;
  private String nganhHoc;
  private int gioiTinh;
  
  public SinhVien() {
  }

  public SinhVien(String msv, String nganhHoc, int gioiTinh, int id, String ten, String sdt) {
    super(id, ten, sdt);
    this.msv = msv;
    this.nganhHoc = nganhHoc;
    this.gioiTinh = gioiTinh;
  }

  public int getGioiTinh() {
    return gioiTinh;
  }

  public void setGioiTinh(int gioiTinh) {
    this.gioiTinh = gioiTinh;
  }

 
  public String getMsv() {
    return msv;
  }

  public void setMsv(String msv) {
    this.msv = msv;
  }

  public String getNganhHoc() {
    return nganhHoc;
  }

  public void setNganhHoc(String nganhHoc) {
    this.nganhHoc = nganhHoc;
  }
  
  
  @Override
  public void inRaManHinh() {
    System.out.printf("ID: %d | Tên: %s | Sđt: %s | Msv:%s | Ngành Học: %s \n",getId(),getTen(),getSdt(),getMsv(),getNganhHoc());
  }
  
}
