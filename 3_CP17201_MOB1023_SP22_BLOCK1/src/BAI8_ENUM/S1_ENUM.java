/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI8_ENUM;

/**
 *
 * @author dungna29
 */
//Có thể khai báo Enum nằm bên ngoài class thì sẽ không được sử dụng Access Modifier
enum CacThuTrongTuan {
    THUHAI, THUBA, THUTU, THUNAM, THUSAU, THUBAY, CHUNHAT;
}

public class S1_ENUM {
//    enum CacThuTrongTuan{
//        THUHAI,THUBA,THUTU,THUNAM,THUSAU,THUBAY,CHUNHAT;
//    }

    public static void main(String[] args) {
        /*
            Trong java
        1. Enum được sử dụng như là kiểu dữ liệu đặc biết và nó thường đại diện cho hằng cố định.
        2. Enum nó có thể chứa các trường, phương thức và constructor
        3. Bởi Enum là hằng vì vậy các giá trị sẽ phải viết hoa.
        4. Enum còn có thể Implement Interface
         */
        //Chú ý: Để in giá trị ra màn hình thì bắt buộc enum phải chấm values()
        for (CacThuTrongTuan x : CacThuTrongTuan.values()) {
            System.out.println(x);
        }
        //Khi so sánh với ENUM
        CacThuTrongTuan c1 = CacThuTrongTuan.THUBA;
        if (c1.equals(CacThuTrongTuan.CHUNHAT)) {
            System.out.println("Hôm nay ko phải đi học");
        } else {
            System.out.println("Hôm nay phải vào AP");
        }
        //Đối với Enum có thể sử dụng toán tử == để so sánh
        if (c1 == CacThuTrongTuan.CHUNHAT) {
            System.out.println("Hôm nay ko phải đi học");
        } else {
            System.out.println("Hôm nay phải vào AP");
        }
    }
}
