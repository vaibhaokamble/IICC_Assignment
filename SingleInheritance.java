/* 22) Write a program in Java to demonstrate the concept of single inheritance. */

package ASSIGNMENT;

class Employee {
    float salary = 40000;
}

class SingleInheritance extends Employee {
    int bonus = 10000;

    public static void main(String args[]) {
        SingleInheritance s = new SingleInheritance();
        System.out.println("Programmer salary is:" + s.salary);
        System.out.println("Bonus of Programmer is:" + s.bonus);
    }
}