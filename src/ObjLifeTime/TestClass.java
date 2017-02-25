package ObjLifeTime;
import static util.Print.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class TestClass {

	void open() {
		println("TestClass");
	}

	public TestClass() {	
		open();
	}
	



	public static void main(String args[]) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		TestClass testClass = new Other("ed");

	}
	

	 
}
class Other extends TestClass {

	private String s1;
	
	public Other(String s1) {
		this.s1 = s1;
		println("Other "  + s1);

	}
	
	void open() {
		println("Other open " + s1);
	}
	
	
}