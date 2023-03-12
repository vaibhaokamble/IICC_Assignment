package DataType;

//Demonstrate lifetime of a variable.
class LifeTime {
	public static void main(String args[]) {
		int x;
		for (x = 0; x < 5; x++) {
			int y = 17; // y is initialized each time block is entered
			System.out.println("y is: " + y); // this always prints -1
			y = 11;
			System.out.println("y is now: " + y);
		}
	}
}