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
public class F1 extends F0 {

  private String variable4;
  private String variable5;

  public F1() {
  }

  public F1(String variable4A, String variable5, String variable1, String variable2, String variable3) {
    super(variable1, variable2, variable3);
    variable4 = variable4A;
    this.variable5 = variable5;
    //this: Tham chiếu đến thuộc tính và phương thức của lớp hiện tại
    //super:Tham chiếu đến thuộc tính và phương thức của lớp cha
  }

  public String getVariable4() {
    return variable4;
  }

  public void setVariable4(String variable4) {
    this.variable4 = variable4;
  }

  public String getVariable5() {
    return variable5;
  }

  public void setVariable5(String variable5) {
    this.variable5 = variable5;
  }

  @Override
  public void method3() {
    //Code lại ở đây
  }

  @Override
  public void method1() {
    super.method1(); //To change body of generated methods, choose Tools | Templates.
  }
  
  
}
