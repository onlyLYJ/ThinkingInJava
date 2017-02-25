import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class test {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(1,5);
		int b = a.get(0);
		int c = a.get(1);
		System.out.println(c);

	}

}
