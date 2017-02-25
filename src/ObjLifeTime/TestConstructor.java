package ObjLifeTime;
import static util.Print.*;

import util.Print;

/*Exercise 17: (2) Create a class with a constructor that takes a String argument. During
construction, print the argument. Create an array of object references to this class, but don’t
actually create objects to assign into the array. When you run the program, notice whether
the initialization messages from the constructor calls are printed.*/

public class TestConstructor {
	
	
	private String name;

	public TestConstructor(String name) {
		this.name = name;
		println("In constructor " + name);
	}
	
	static void printString(String[] args) {
		
		for(String str : args) {
			print( str + SEPERATOR ) ;
		}
		
	}

	
	
//	Exercise 19: (2) Write a method that takes a vararg String array. Verify that you can
//	pass either a comma-separated list of Strings or a String[] into this method.	
	
	
	public static void main(String args[]) {
		
		
		TestConstructor[] tConstructors = new TestConstructor[10];
		println("before anything insert");
		tConstructors[1] = new TestConstructor("Fist"); 
		println("Ex 18 Ened");
		
		
		println("Ex 19 Begin");
		String str1[] = {"a","b","c"} ;
		printString(str1);

		println(args.length);
		
	}

}



