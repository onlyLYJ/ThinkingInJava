package TransRatio;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Scanner;

public class myTransRatio implements InvocationHandler {

	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		String m = method.getName();
		String[] str1 = m.split("trans");
		String[] str2 = str1[1].split("To");
		String n = (String) args[0];
		int from = Integer.valueOf(str2[0]);
		int to = Integer.valueOf(str2[1]);
		int num = Integer.parseInt(n, from);
		String n1 = "";
		String f = "";
		String t = "";
		switch(from){
		case 2:
			t = "(Binary)";
			break;
		case 16:
			t = "(Hex)";
			break;
		default:
			t = "(Decimal)";

		}
				
		switch(to) {
			case 16:
				n1 = Integer.toHexString(num);
				f = "Hex";
				break;
			case 8:
				n1 = Integer.toOctalString(num);
				f = "Octal";
				break;
			case 2:
				n1 = Integer.toBinaryString(num);
				f = "Binary";
				break;
			default:
				n1 = Integer.toString(num);
				f = "Decimal";
		}
		System.out.println( f + " version of " + n + t + " is " + n1 );
		return null;
	}
	
	

}
