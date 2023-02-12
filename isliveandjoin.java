/* 20) Write a program in Java to demonstrate isAlive() and join() method of a thread. */

package ASSIGNMENT;

public class isliveandjoin extends Thread {
    public void run(){
        System.out.println("the Boys");
        try {
            Thread.sleep(1500);
        } catch (Exception e) {
        }
            System.out.println("MCA department");
        }
        public static void main(String[] args) {
            isliveandjoin c1 = new isliveandjoin();
            isliveandjoin c2 = new isliveandjoin();
            c1.start();
            c2.start();
    }
}
