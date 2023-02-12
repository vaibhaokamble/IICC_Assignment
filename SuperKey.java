/* 25) Write a program in Java to demonstrate the use of super keyword.
 */

package ASSIGNMENT;

class Employee{
    Employee(){
        super();
        System.out.println("this was employee method");
    }
}

class Labour extends Employee{
    Labour(){
        System.out.println("this a labour");
    }
}
public class SuperKey {
    public static void main(String[] args) {   
       Labour l = new Labour();
    }
}
