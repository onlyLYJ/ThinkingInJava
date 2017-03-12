package controller;

//Exercise 26: (2) Create a class with an inner class that has a non-default constructor
//(one that takes arguments). Create a second class with an inner class that inherits from the
//first inner class.
class WithInner {
	String a;

	class Inner {
		public Inner(String string) {
			a = string;
		}

		void p() {
			System.out.println("inner p");
		}

	}
}

public class InheritInner extends WithInner.Inner {
	// ! InheritInner() {} // Won’t compile
	InheritInner(WithInner wi) {
		wi.super("ab");
	}

	public static void main(String[] args) {

		WithInner wi = new WithInner();
		InheritInner ii = new InheritInner(wi);
		ii.p();
		String b = wi.a;
		System.out.println(b);
	}
}
