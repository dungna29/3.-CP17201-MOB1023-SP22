/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_CRUD_SINHVIEN_DOC_GHI_FILE;

import java.io.Serializable;



/**
 *
 * @author Dungna89
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