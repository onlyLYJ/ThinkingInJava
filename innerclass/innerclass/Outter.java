package innerclass;
import static util.Print.*;

/*Exercise 7: (2) Create a class with a private field and a private method. Create an
inner class with a method that modifies the outer-class field and calls the outer-class method.
In a second outer-class method, create an object of the inner class and call its method, then
show the effect on the outer-class object.
*/
public class Outter {

	private int outter = 0;
	
	private void display(String str) {
		println(str + ", outter = " + outter);
	}
	
	Inner out2(int t) {
		display("out2 begins");
		Inner in = null;
		try {
			in = new Inner() {
				
				public void value() {	
					outter = t;
				}
				{outter = 1;}
			};
			
			return in;
		} finally {
			display("In out2 finally");
			in.value();
			display("After in.value()");
			outter = 2;
			display("Before end of finally");
		}

	}
	
	void out3() {
		display("out3 begins");
		Inner in = out2(3);
	}
	
	void out4() {
		display("in out4");
		Inner in5 = new Inner(){
			@Override
			public void value() {
				outter = 4;
			}	
		};
		in5.value();
		display("before end of out4");
	}

	
	public String out5(String t) {
		 return new Inner() {
			private String a = t;
			public String readA() {
				value();
				return a;
			}
			@Override
			public void value() {
				outter = Integer.parseInt(t);
			}
		}.readA();
			
	}
	
	

	public static void main(String[] args) {
		Outter out = new Outter();
		out.out3();
		out.out4();
		out.out5("5");
		out.display("after in5");
	}

}
