package Interface;
import static util.Print.*;

public class Apply {

	static void process(Processor p, Object o) {
		println(p.name());
		println(o);
		println(p.process(o));
	}
	
	static String bString = "DOG IDE @ 98";
	
	public static void main(String args[]) {
		Apply.process(new SwapAdaptor(new SwapCharactor()), bString);
	}
	
}
