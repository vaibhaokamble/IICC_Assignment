/* 26) Write a program in Java to print and solve the following series using for
loop S=1/1! + ½! +1/3!+……..+1/n */

package ASSIGNMENT;

public class SeriesLoop{

    static int fact(int number){
        int res=1;
        for(int i=2;i<=number;i++){
            res = res * i;
        }
        return res;
    }

    static double sum(int number){
        double sum=0;
        for(int i=1;i<=number;i++){
            sum = sum + 1.0/fact(i);
        }
        return sum;
    } 
    public static void main(String[] args) {
      int number = 5;
      System.out.println("sum of series = " +sum(number));  
    }
}
