package Condition;
import static util.Print.*;
import junit.framework.TestCase;

/*Exercise 5: (4) Repeat Exercise 10 from the previous chapter, using the ternary operator
and a bitwise test to display the ones and zeroes, instead of Integer.toBinaryString( ).*/

public class Ex5_ToBinaryWithBit extends TestCase{
	
	
	private static String DecimalToBinary(int a) {
		StringBuilder sb = new StringBuilder(32);
	    for(int i = 32; i-- > 0; sb.append((a >> i) & 1));
	    Integer b = Integer.parseInt(sb.toString());
	    println(b);
	    return b.toString();
		
	}
	
	public void testTrans() {
		for (int i = 1; i< 100; i++) {
			assertEquals(Integer.toBinaryString(i),DecimalToBinary(i));
		}
	}





}
