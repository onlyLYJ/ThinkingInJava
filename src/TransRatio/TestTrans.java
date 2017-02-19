package TransRatio;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestTrans {
	
	public TransRatios getTransRatio(){
		InvocationHandler handler = new myTransRatio();
		TransRatios superTrans = (TransRatios) Proxy.newProxyInstance(TransRatio.class.getClassLoader(), new Class[]{TransRatios.class}, handler);
		return superTrans;
	}

	public static void main(String args[]) {
		InvocationHandler handler = new myTransRatio();
		TransRatios superTrans = (TransRatios) Proxy.newProxyInstance(TransRatio.class.getClassLoader(), new Class[]{TransRatios.class}, handler);
		superTrans.trans2To10("1111");
		superTrans.trans10To2("15");
		superTrans.trans16To2("f");
		superTrans.trans2To16("1111");
		superTrans.trans10To16("15");
		superTrans.trans16To10("f");
		
//		Output:
//		Decimal version of 1111(Binary) is 15
//		Binary version of 15(Decimal) is 1111
//		Binary version of f(Hex) is 1111
//		Hex version of 1111(Binary) is f
//		Hex version of 15(Decimal) is f
//		Decimal version of f(Hex) is 15

	}
}
