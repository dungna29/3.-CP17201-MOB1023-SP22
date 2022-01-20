/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_CRUD_SINHVIEN;

import BAI_TAP_MAU_ON_TAP_JAVA1.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.Normalizer;
import java.util.regex.Pattern;

/**
 *
 * @author Dungna89
 */
public class Utilities {

  public boolean checkSo(String text) {
    Pattern pattern = Pattern.compile("\\d+");//Regex
    Matcher matcher = pattern.matcher(text);
    return matcher.matches();//Nếu là số thì là true
  }

  public String vietHoaFullname(String fullname) {
    var temp = fullname.trim().toLowerCase();
    String[] arrFullName = temp.split("\\s+");//NGUYỄN DUY THỊ HÀ
    String Fname = "";
    for (String x : arrFullName) {
      Fname += vietHoaTu(x) + " ";
    }
    return Fname;//Nguyễn Duy Thị Hà
  }

  public String vietHoaTu(String name) {//YEN
    var temp = name.trim().toLowerCase();//yen
    return String.valueOf(temp.charAt(0)).toUpperCase() + temp.substring(1);//=Yen
  }

  //Về nhà viết 1 phương thức dựa vào tên có thể tạo ra mã sinh viên tự động
  /*
    Tên: Nguyễn Mạnh Dũng
    Msv: dungnmPH01
   */
  public String getMa(String fullName, int maxID, int loaiTk) {
    String[] arrFullName = fullName.split("\\s+");
    var name = vietHoaTu(arrFullName[arrFullName.length - 1]);//Dũng
    for (int i = 0; i < arrFullName.length - 1; i++) {
      name += String.valueOf(arrFullName[i].charAt(0)).toUpperCase();//DũngNM
    }
    name += loaiTk == 0 ? "PH" : "" + String.valueOf(maxID);
    return unAccent(name);//DungnNMPH01
  }

  public String unAccent(String s) {//Convert từ tiếng việt có dấu về tiếng việt 0 dấu
    String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
    Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    return pattern.matcher(temp).replaceAll("").replaceAll("Đ", "D").replace("đ", "");
  }
}
