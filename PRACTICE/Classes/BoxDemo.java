package Classes;

/* A program that uses the Box class.
Call this file BoxDemo.java
*/
class Box {
	double width;
	double height;
	double depth;
	public double volume() {
		return depth;
		// TODO Auto-generated method stub
		
	}
	public void setDim(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}
}

// This class declares an object of type Box.
class BoxDemo {
	public static void main(String args[]) {
		Box mybox = new Box();
		double vol;
// assign values to mybox's instance variables
		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;
// compute volume of box
		vol = mybox.width * mybox.height * mybox.depth;
		System.out.println("Volume is " + vol);
	}
}