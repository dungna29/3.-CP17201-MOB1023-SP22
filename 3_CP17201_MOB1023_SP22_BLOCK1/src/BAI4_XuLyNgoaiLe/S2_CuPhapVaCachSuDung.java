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
public class S2_CuPhapVaCachSuDung {

  /*
            ❑Mỗi khối try yêu cầu có ít nhất một khối catch
            hoặc/và duy nhất một khối finally.
            ❑Khối finally sẽ được thực hiện dù ngoại lệ có xuất
            hiện hay không.
        
            Các phương thức của lớp Exception
        STT	Phương thức và Miêu tả
        1 public String getMessage() Trả về một message cụ thể về exception đã xảy ra. Message này được khởi tạo bởi phương thức contructor của Throwable
        2 public Throwable getCause()Trả về nguyên nhân xảy ra exception biểu diễn bởi đối tượng Throwable
        3 public String toString()Trả về tên của lớp và kết hợp với kết quả từ phương thức getMessage()
        4 public void printStackTrace()In ra kết quả của phương thức toString cùng với stack trace đến System.err
        5 public StackTraceElement [] getStackTrace() Trả về một mảng chứa mỗi phần tử trên stack trace. Phần tử tại chỉ mục 0 biểu diễn phần trên cùng của Call Stack, và phần tử cuối cùng trong mảng biểu diễn phương thức tại dưới cùng của Call Stack
        6 public Throwable fillInStackTrace() Fills the stack trace of this Throwable object with the current stack trace, adding to any previous information in the stack trace.
   */
  public static void main(String[] args) {
    luuY();
  }

  static void vDTryCatch() {
//    try {
//      Code có thể ném ra Exception
//    } catch (Exception e) {
    //Xử lý Exception
//    }
    try {
      int zero = 0;
      int average = 10 / zero;
      System.out.println("Average = " + average);
    } catch (Exception dungna) {
      System.out.println(dungna.toString());
      System.out.println(dungna.getMessage());
      dungna.printStackTrace();
    }
    System.out.println("Đã chạy đến cuối phương thức");
  }
  
  static void Finally(){
      //       try {
    //    // code có thể ném ra ngoại lệ
    //} catch(Exception_class_Name_1 ex) {
    //    // code xử lý ngoại lệ 1
    //} catch(Exception_class_Name_2 ex) {
    //    // code xử lý ngoại lệ 2
    //} catch(Exception_class_Name_n ex) {
    //    // code xử lý ngoại lệ n
    //} finally {
    //    // code trong khối này luôn được thực thi
    //}
    
     try {
      String[] arr = {"1", "b", "88"};
      System.out.println(Integer.parseInt(arr[0]) / 1);
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException");
    } catch (NumberFormatException e) {
      System.out.println("NumberFormatException");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBoundsException");
    } catch (Exception e) {
      System.out.println("Exception");
    }finally{
       System.out.println("Chạy vào đây nè finally");
     }
  }
  /*
        Tại một thời điểm chỉ xảy ra một ngoại lệ và tại một thời điểm chỉ có một khối catch được thực thi. Khi exception đã bị bắt ở một catch thì các catch tiếp theo sẽ không được bắt.        
        Tất cả các khối catch phải được sắp xếp từ cụ thể nhất đến chung nhất (từ exception con đến exception cha), tức là phải khai báo khối lệnh catch để xử lý lỗi NullPointerException, ArithmeticException, … trước khi khai báo catch để xử lý lỗi Exception.        
        Khối lệnh finally luôn được thực thi dù chương trình có xảy ra ngoại lệ hay không (ngay cả sử dụng lệnh return).        
        Đối với mỗi khối try, có thể không có hoặc nhiều khối catch, nhưng chỉ có một khối finally.
        Khối finally sẽ không được thực thi nếu chương trình bị thoát bằng cách gọi System.exit() 
        hoặc xảy ra một lỗi (Error) không thể tránh khiến chương trình bị chết.
   */
  
  static void luuY(){
//    try {
//      String[] arr = {"1", "b", "88"};
//      System.out.println(Integer.parseInt(arr[0]) / 0);
//    } catch (ArithmeticException e) {
//      System.out.println("ArithmeticException");
//      return;//Vẫn chạy vào Finally sau đó mới kết thúc phương thức
//    } catch (NumberFormatException e) {
//      System.out.println("NumberFormatException");
//    } catch (ArrayIndexOutOfBoundsException e) {
//      System.out.println("ArrayIndexOutOfBoundsException");
//    } catch (Exception e) {
//      System.out.println("Exception");
//    }finally{
//       System.out.println("Chạy vào đây nè finally");
//     }
//    System.out.println("Đã chạy hết phương thức");
 try {
      String[] arr = {"1", "b", "88"};
      System.out.println(Integer.parseInt(arr[0]) / 0);
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException");
      System.exit(0);//Sẽ không chạy vào Finally nữa
    } catch (NumberFormatException e) {
      System.out.println("NumberFormatException");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBoundsException");
    } catch (Exception e) {
      System.out.println("Exception");
    }finally{
       System.out.println("Chạy vào đây nè finally");
     }
    System.out.println("Đã chạy hết phương thức");
  }
}