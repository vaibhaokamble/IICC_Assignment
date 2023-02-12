/* 16) Write a program in Java to create a thread by extending a class. */

package ASSIGNMENT;

class ThreadExt extends Thread{
    public void run(){
        System.out.println("threading is running");
    }
    public static void main(String[] args) {   
        ThreadExt t = new ThreadExt();
        t.start();
    }
}

