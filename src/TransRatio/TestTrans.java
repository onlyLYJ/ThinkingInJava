package TransRatio;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestTrans {

	public static void main(String args[]) {
		TransRatios tr = new TransRatio();
		InvocationHandler handler = new myTransRatio();
		TransRatios superTrans = (TransRatios) Proxy.newProxyInstance(TransRatio.class.getClassLoader(), new Class[]{TransRatios.class}, handler);
		superTrans.trans2To10("1111");
		superTrans.trans10To2("15");
		superTrans.trans16To2("f");
		superTrans.trans2To16("1111");
		superTrans.trans10To16("15");
		superTrans.trans16To10("f");
		
	}
}
