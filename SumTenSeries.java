/* 32) Write a program in Java to display and print the sum of following series
S= a + a2 / 2 + a3 / 3 + …… + a10 / 10 */

package ASSIGNMENT;

import java.util.Scanner;

public class SumTenSeries {
  public static void main(String[] args) {
    Scanner v = new Scanner(System.in);
    System.out.print("Enter the value of a: ");
    int a = v.nextInt();

    double sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += Math.pow(a, i) / i;
    }

    System.out.println("Sum of the series: " + sum);
  }
}
