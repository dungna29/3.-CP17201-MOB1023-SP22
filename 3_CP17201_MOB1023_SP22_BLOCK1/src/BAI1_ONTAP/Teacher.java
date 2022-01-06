/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1_ONTAP;

/**
 *
 * @author Dungna89
 */
/*
Khi kế thừa 1 lớp abstract bắt buộc lớp con phải kế thừa tất cả các phương thức abstract còn các phương thức không cùng loại thì có thể có hoặc không đều được.
*/
public class Teacher extends Person {

  private String variable4;

  public Teacher() {
  }

  public Teacher(String variable4, String variable1, String variable2, String variable3) {
    super(variable1, variable2, variable3);
    this.variable4 = variable4;
    //this dùng dể tham chiếu đến thuộc tính và phương thức của lớp hiện tại.
    //super dùng dể tham chiếu đến thuộc tính và phương thức của lớp cha.
  }
  

  public Teacher(String variable4) {
    this.variable4 = variable4;
  }

  public String getVariable4() {
    return variable4;
  }

  public void setVariable4(String variable4) {
    this.variable4 = variable4;
  }

  @Override
  public void method2(String a) {
    super.method2(a); //To change body of generated methods, choose Tools | Templates.
  }

//  @Override
//  public void method1(String a, int b) {
//    super.method1(a, b); //To change body of generated methods, choose Tools | Templates.
//  }

  @Override
  public void method3(double a, int b) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String method4(double a) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}
