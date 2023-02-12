/* 18) Write a program in Java to create the thread by using runnable 
interface. */

package ASSIGNMENT;

public class ThreadRunnable implements Runnable {

    @Override
    public void run() {
     System.out.println("thread has ended");   
    }
    public static void main(String[] args) {
        ThreadRunnable tr = new ThreadRunnable();
        Thread td = new Thread(tr);
        td.start();
        System.out.println("i am vaibhao");
    }
}
