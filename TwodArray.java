/* 29) Write a program in Java to print two matrices and their multiplication by 
using the concept of 2-D array. ( use matrix of size 3X3) */

package ASSIGNMENT;

public class TwodArray {
    public static void main(String[] args) {
        
        int a[][]={{1,2,3},{2,3,4},{5,6,7}};
        int b[][]={{7,6,5},{4,3,2},{3,2,1}};
int c[][]=new int[3][3];
for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
        c[i][j]=0;
        for(int k=0;k<3;k++){
            c[i][j]+=a[i][k]*b[k][j];
        }
        System.out.print(c[i][j] +" ");
    }
    System.out.println();
    }
}    
}
