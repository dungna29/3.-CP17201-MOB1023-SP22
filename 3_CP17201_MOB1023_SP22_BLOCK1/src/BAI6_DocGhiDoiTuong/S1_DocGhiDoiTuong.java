/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI6_DocGhiDoiTuong;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dungna89
 */
public class S1_DocGhiDoiTuong {

  static List<SinhVien> _lstSinhViens = new ArrayList<SinhVien>();

  public static void main(String[] args) {
    try {
      ghiFile();
      docFile();
    } catch (Exception e) {
    }
  }

  static void ghiFile() throws IOException {
    _lstSinhViens.add(new SinhVien("dungnaPH001", "JAVA", 1, 1, "Nguyễn Anh Dũng", "01234756"));
    _lstSinhViens.add(new SinhVien("dungnmPH002", "JAVA", 0, 2, "Trượt Mạnh Dũng", "01234756"));
    _lstSinhViens.add(new SinhVien("dungnhPH003", "C#", 1, 3, "Lâm Hoàng Dũng", "01234756"));
    _lstSinhViens.add(new SinhVien("namnaPH004", "C#", 1, 4, "Tống Anh Nam", "01234756"));
    _lstSinhViens.add(new SinhVien("dungnaPH005", "JAVA", 1, 5, "Lê Anh Dũng", "01234756"));
    //Check file có trong máy hay không
    //File file = new File("dungna.txt");//Nếu không có đường dẫn thì sẽ lưu mặc định vào trong thư mục project
    File file = new File("C:\\Users\\nguye\\Desktop\\dungna29.txt");
    if (!file.exists()) {
      file.createNewFile();//Khi không tìm thấy file thì sẽ tiến hành tạo file mới
    }

    //Tiến hành ghi file
    FileOutputStream fos = new FileOutputStream(file);
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    for (SinhVien x : _lstSinhViens) {
      oos.writeObject(x);
    }
    oos.close();
    fos.close();
  }

  static void docFile() throws FileNotFoundException, IOException, ClassNotFoundException {
    File file = new File("C:\\Users\\nguye\\Desktop\\dungna29.txt");
    if (!file.exists()) {
      System.out.println("File không tìm thấy");
      return;
    }
    FileInputStream fis = new FileInputStream(file);
    ObjectInputStream ois = new ObjectInputStream(fis);
    List<SinhVien> _lstSinhViens_news = new ArrayList<SinhVien>();
    while (fis.available() > 0) {
      var temp = (SinhVien) ois.readObject();
      _lstSinhViens_news.add(temp);
    }
    ois.close();
    fis.close();
    for (SinhVien x : _lstSinhViens_news) {
      x.inRaManHinh();
    }
  }
}
