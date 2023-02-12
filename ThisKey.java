/* 11) Write a program in Java to demonstrate this keyword. */

package ASSIGNMENT;


class Box4{
    double width;
    double height;
    double length;

    Box4(double width,double height,double lenght){
        this.width=width;
        this.height=height;
        this.length=lenght;
    }
    double getVolume(){
        return width * height * length;
    }
}
public class ThisKey {
    public static void main(String[] args) {
        Box4 b4 = new Box4(50, 3, 15);
        System.out.println("the volume of boxes = " +b4.getVolume());
    }
}
