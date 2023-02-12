/* 27) Write a program in Java to print and solve the following series using while loop
 S=1 +1/0.1+1/0.01+……..+nth term */

package ASSIGNMENT;

public class SeriesWhileloop {
    public static void main(String[] args) {
        double sum = 0;
        double rem = 0.1;
    int number=10;
    int i=1;
while(i<=number){
    sum = sum + 1/rem;
    rem = rem * 0.1;
    i++;
}
System.out.println("sum of the series = " +sum);
}
}
