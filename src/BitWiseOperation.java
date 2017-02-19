import static util.Print.*;
import TransRatio.TestTrans;
import TransRatio.TransRatios;

public class BitWiseOperation {
	
	private static final String NEW_LINE = "\n";
	private static final String SEPERATOR = "------";
	
	
	public static void printBitOperation(int a,int b) {
		int c = a & b;
		int d = a | b;
		int e = a ^ b;
		int f = a >> 1;
		int g = a << 1;
		StringBuilder sb = new StringBuilder();
		sb.append("a: " + a + NEW_LINE);
		sb.append("b: " + b + NEW_LINE);
		sb.append("a&b: " + c + NEW_LINE);
		sb.append("a|b: " + d + NEW_LINE);
		sb.append("a^b: " + e + NEW_LINE);
		sb.append("a>>1: " + f + NEW_LINE);
		sb.append("a<<1: " + g + NEW_LINE);
		sb.append(SEPERATOR);
		println(sb.toString());
		
	}
	
	public void rightShiftBinaryNum(String a,int n) {

		TestTrans tt = new TestTrans();
		TransRatios tr= tt.getTransRatio();
		Integer b = new Integer(tr.trans2To10(a));
		int count=0;
		for(int i=a.length(); i>0; i--) {
			b >>= n;
			print("Right shift "+ ++count + " times: ");
			tr.trans10To2(b+"");
		}
		
	}
	
	public static void main(String args[]) {
		
		printBitOperation(3,5);
		printBitOperation(1,2);
		printBitOperation(0,1);
		println(true^false);
		
		BitWiseOperation bwo = new BitWiseOperation();
		String a = "100000000";
		bwo.rightShiftBinaryNum(a,1);


//		Numbers are transfered to Binary form to do the Bitwise Operation 
/*Output:		
		a: 3
		b: 5
		a&b: 1
		a|b: 7
		a^b: 6
		a>>1: 1
		a<<1: 6
		------
		a: 1
		b: 2
		a&b: 0
		a|b: 3
		a^b: 3
		a>>1: 0
		a<<1: 2
		------
		a: 0
		b: 1
		a&b: 0
		a|b: 1
		a^b: 1
		a>>1: 0
		a<<1: 0
		------
		true
*///:~
	}

}
