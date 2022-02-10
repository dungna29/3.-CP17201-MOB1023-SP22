/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI4_XuLyNgoaiLe;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dungna89
 */
public class MainCheckYeuDuong {
  public static void main(String[] args) {
    HocSinhService hs = new HocSinhService();
    try {
      hs.checkTuoiYeu(15);
    } catch (CheckYeuDuongException ex) {
      System.out.println(ex.toString());
    }
  }
}
