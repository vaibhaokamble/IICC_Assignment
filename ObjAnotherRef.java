/* 6) Write a Java program to assign the one object to another object. */

package ASSIGNMENT;

class Student {  
    int refno;  
    String refname;  
    Student(int i, String n) {  
     refno = i;  
     refname = n;  
    }  
    Student(Student s) {  
     refno = s.refno;  
     refname = s.refname;  
    }  
    void display() {  
        System.out.println(refno + " " + refname);  
       }  
    }
public class ObjAnotherRef {
    public static void main(String[] args) {
        Student s1 = new Student(17,"vaibhao");
        Student s2 = new Student(s1);
        s1.display();
        s2.display();
    }
}
