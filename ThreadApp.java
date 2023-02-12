/* 15) Write a program in Java to create a main thread.  */

package ASSIGNMENT;

public class ThreadApp{
    public static void main(String[] args) {
        Thread t = new Thread("my thred srting");
        t.start();
        String str = t.getName();
        System.out.println(" the string is : " +str);
    }
}
