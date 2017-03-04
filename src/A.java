
import static util.Print.*;


public class A {
	
	void f() {
		println("in A");
	}
	
	class B {
		
		void g() {
			println("in B");
		}
		@SuppressWarnings("rawtypes")
		
		class C {
			void h() {
				f();
				g();
			}
		}
	}
	
	public static void main(String[] args) {
		
	}
}
