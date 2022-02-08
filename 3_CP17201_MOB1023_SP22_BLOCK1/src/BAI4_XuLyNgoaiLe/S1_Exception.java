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
public class S1_Exception {
  /*
        Exception là một sự kiện xảy ra trong quá trình thực thi một chương trình Java, 
        nó làm phá vỡ cái flow (luồng xử lý) bình thường của một chương trình, thậm chí chết chương trình.
        
        Một ngoại lệ có thể xảy ra với nhiều lý do khác nhau, nó nằm ngoài dự tính của chương trình.
        Một vài ngoại lệ xảy ra bởi lỗi của người dùng, 
        một số khác bởi lỗi của lập trình viên và số khác nữa đến từ lỗi của nguồn dữ liệu vật lý. 
        Chẳng hạn như:
            Người dùng nhập dữ liệu không hợp lệ.
            Truy cập ngoài chỉ số mảng.
            Một file cần được mở nhưng không thể tìm thấy.
            .......
        
        Phân cấp của Exception trong java.
            + Class ở mức cao nhất là Throwable
            + Hai class con trực tiếp là Error và Exception.
         */
     /*
            Định nghĩa mức cơ bản: Try Catch dùng để chống crash chương trình.
            1. Không sử dụng try catch khi đang lập trình
            2. Ở môi trường học tập Chỉ dùng try catch khi nộp bài hoặc đi chấm bài
            3. Trong môi trường làm việc: Chỉ khi nào đóng gói cho Tester thì phải đóng try catch hoặc trước khi bàn giao cho khách hàng cũng phải đóng lại.
         */
  public static void main(String[] args) {
    Exception2();
  }
  static void Exception1(){
    int zero = 0;
    int average = 10/zero;
    System.out.println("Average = " + average);
    //Exception in thread "main" java.lang.ArithmeticException: / by zero    
  }
  static void Exception2(){      
    int a = Integer.parseInt("Dũng");
    System.out.println(a);
  }
}
