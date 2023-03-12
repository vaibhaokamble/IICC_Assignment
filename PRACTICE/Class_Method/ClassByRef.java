package Class_Method;

//Objects are passed by reference.
class Test2 {
	int a, b;

	Test2(int i, int j) {
		a = i;
		b = j;
	}

//pass an object
	void meth(Test2 ob) {
		ob.a *= 2;
		ob.b /= 2;
	}
}

class CallByRef {
	public static void main(String args[]) {
		Test2 ob = new Test2(15, 20);
		System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
		ob.meth(ob);
		System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
	}
}