/* 14) Write a program in Java to demonstrate concept of reference to object. */

package ASSIGNMENT;

class Demo2 {
    int x = 10;
    int y = 20; 
    int display(Demo2 A, Demo2 B)
    {
        A.x = 95;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        return 0;
    }
}
public class ReferencesObj {
    public static void main(String[] args) {
        Demo2 C = new Demo2();
        Demo2 D = new Demo2();
        D.y = 55;
        C.display(C, D);
        D.display(C, D);
    }
}
