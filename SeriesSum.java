/* 33) Write a program in Java to display and print the sum of following series
S= 1+2+4+7+11+…..+nth term */

package ASSIGNMENT;

import java.util.Scanner;

public class SeriesSum {
  public static void main(String[] args) {
    Scanner v = new Scanner(System.in);
    System.out.print("Enter the value of n: ");
    int n = v.nextInt();

    int sum = 0;
    int term = 1;
    for (int i = 1; i <= n; i++) {
      sum += term;
      term += i;
    }

    System.out.println("Sum of the series: " + sum);
  }
}
