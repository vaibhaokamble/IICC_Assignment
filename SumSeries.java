/* 31) Write a program in Java to display and print the sum of following series
S=x - x2/3 + x3/5 - x4/7 + …. to n terms */

package ASSIGNMENT;
import java.util.*;

public class SumSeries {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("enter the value of x = ");
        int x = v.nextInt();
        System.out.println("enter the number of series");
        int n = v.nextInt();
        double sum=0;
        int rem=1;
        for(int i=0;i<n;i++){
            sum = sum + rem*(Math.pow(x, i)/(2*i+1));
            rem=rem*-1; 
        }
        System.out.println("sum of series" +sum);
    }
}
