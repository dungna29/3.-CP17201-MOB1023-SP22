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
//abstract Class thì vẫn là 1 lớp cha hoàn toàn bình thường nhưng phải sử dụng phương thức abstract bên trong nó.
public abstract class Person {//Cha
  private String variable1;
  private String variable2;
  private String variable3;

  public Person() {
  }

  public Person(String variable1, String variable2, String variable3) {
    this.variable1 = variable1;
    this.variable2 = variable2;
    this.variable3 = variable3;
  }

  public String getVariable1() {
    return variable1;
  }

  public void setVariable1(String variable1) {
    this.variable1 = variable1;
  }

  public String getVariable2() {
    return variable2;
  }

  public void setVariable2(String variable2) {
    this.variable2 = variable2;
  }

  public String getVariable3() {
    return variable3;
  }

  public void setVariable3(String variable3) {
    this.variable3 = variable3;
  } 
  
  public void method1(String a, int b){
    
  }
  public void method2(String a){
    
  }
  
  //Phương thức abstract không body code
  public abstract void method3(double a, int b);
  public abstract String method4(double a);
  
}
