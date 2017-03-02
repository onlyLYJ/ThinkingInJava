package innerclass;

import java.util.ArrayList;
import java.util.List;

/*Exercise 2: (1) Create a class that holds a String, and has a toString( ) method that
displays this String. Add several instances of your new class to a Sequence object, then
display them.*/

public class StringDisplayer {

	
	void display() {
		Sequence s = new Sequence();
		s.add(new Str("d"));
		s.display();
	}
	
	class Str {
		String s;
		Str(String s) {
			this.s = s;
		}
		
		public String toString() {
			return s;
		}
	}
	
	class Sequence {
		private List<Str> str = new ArrayList<Str>();
		void add(Str s) {
			str.add(s);
		}
		
		void display() {
			System.out.println(str);
		}
		
	}
	
	public static void main(String args[]) {
		StringDisplayer sd = new StringDisplayer();
		Str a = sd.new Str("a");
		Str b = sd.new Str("b");
		Str c = sd.new Str("c");
		Sequence s = sd.new Sequence();
		s.add(a);
		s.add(b);
		s.add(c);
		s.display();
		sd.display();
	}
	
	
}
