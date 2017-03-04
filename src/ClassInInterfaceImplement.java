
public class ClassInInterfaceImplement implements ClassInInterface {

	private Test t = new Test();
	
	public void howdy() {
		
		t.howdy1();

	}

	public static void main(String[] args) {
		ClassInInterfaceImplement cl = new ClassInInterfaceImplement();
		Test.ok(cl);

	}

}
