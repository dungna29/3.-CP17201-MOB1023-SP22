/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI4_XuLyNgoaiLe;

/**
 *
 * @author Dungna89
 */
public class HocSinhService {
  
  public void checkTuoiYeu(int tuoi)throws CheckYeuDuongException{
    if (tuoi < 16) {
      throw new CheckYeuDuongException("Bạn chưa đủ tuổi để yêu đương nhé");
    }else{
      System.out.println("Chúc mừng bạn đến tuổi yêu rồi");
    }
  }
}
