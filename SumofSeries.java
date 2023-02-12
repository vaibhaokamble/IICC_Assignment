package ASSIGNMENT;

public class SumofSeries {
    public static void main(String[] args) {
        int number = 5;
        int sum=0;    
        for(int i=0;i<number;i++){
            if(i%2==0){
                sum = sum +1;
            }
            else
            {
                sum = sum -1;
            }
        }
        System.out.println("sum of series = " +sum);
    }
}
