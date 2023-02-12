/* 17) Write a program in Java to create the two child thread by extending a 
thread class.
 */

package ASSIGNMENT;

class Thread1 extends Thread{
    public void run(){
        int i=0;
        while(i<5){
            System.out.println("first child thread" +i);
            i=i+1;
        }
        System.out.println("first child class is exist");
    }
}

class Thread2 extends Thread{
    public void run(){
        int j=0;
        while(j<5){
            System.out.println("second child thread" +j);
            j=j+1;
        }
        System.out.println("second child class is exist");
    }
}
public class Thread2Class {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
        int k=0;
        while(k<5){
            System.out.println("main thread " +k);
            k=k+1;
        }
        System.out.println("main thread exist");
    }
}
