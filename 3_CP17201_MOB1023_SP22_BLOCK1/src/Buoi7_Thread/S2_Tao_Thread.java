/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi7_Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dungna89
 */
public class S2_Tao_Thread extends Thread {

  @Override
  public void run() {
    int i = 0;
    while (true) {
      try {
        System.out.println(i++);
        Thread.sleep(3000);
      } catch (InterruptedException ex) {
        break;
      }
    }
  }

  public static void main(String[] args) {
    S2_Tao_Thread thread1 = new S2_Tao_Thread();
    thread1.run();//Khởi động thread
  }
}
