/* 9) Write a program in Java find the volume of box using constructor. */

package ASSIGNMENT;

class Box2{
    double width;
    double height;
    double length;

    Box2(double wid,double hei,double len){
        width=wid;
        height=hei;
        length=len;
    }
    double getVolume(){
        return width * height * length;
    }
}
public class BoxConstructor {
    public static void main(String[] args) {
        Box2 b2 = new Box2(30, 20, 10);
        System.out.println("the volume of boxes = " +b2.getVolume());
    }
}
