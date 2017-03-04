package innerclass;
/*Exercise 23: (4) Create an interface U with three methods. Create a class A with a
method that produces a reference to a U by building an anonymous inner class. Create a
second class B that contains an array of U. B should have one method that accepts and stores
a reference to a U in the array, a second method that sets a reference in the array (specified
by the method argument) to null, and a third method that moves through the array and calls
the methods in U. In main( ), create a group of A objects and a single B. Fill the B with U
references produced by the A objects. Use the B to call back into all the A objects. Remove
some of the U references from the B.*/



interface U {
	void m1();
	void m2();
	void m3();
}

public class Ex23 {
	public static void main(String[] args) {
		B b = new B();
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		b.add(a1.makeU());
		b.add(a2.makeU());
		b.add(a3.makeU());
		b.setNull(1);
		b.setNull(0);
		b.play();


	}
}



class B {
	U[] arrInB = new U[10];
	private int size = 0;
	
	void play() {
		U dd = null;
		for (int i = 0; i < 10; i++) {
			if ((dd = arrInB[i]) != null) {
				arrInB[i].m1();
				arrInB[i].m2();
				arrInB[i].m3();
			}
		}
		
	}
	
	void setNull(int i) {
		arrInB[i] = null;
		size--;
	}
	
	void add(U u) {
		arrInB[size++] = u;
	}
	
}


class A {
	
	U makeU() {
		return new U(){

			@Override
			public void m1() {
				System.out.println(this.getClass()+"m1");
				
			}

			@Override
			public void m2() {
				System.out.println(this.getClass()+"m2");
				
			}

			@Override
			public void m3() {
				System.out.println(this.getClass()+"m3");
				
			};
		
	};
	
	}

}
