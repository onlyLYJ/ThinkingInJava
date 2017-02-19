package ObjLifeTime;
import static util.Print.*;

public class TestFinalize {
	
	private boolean checkout = true;
	private String name;
	
	TestFinalize(String name){
		this.name = name;
		checkout = false;
	}
	
	public void checkout() {
		checkout = true;
	}
	
	
	protected void finalize(){
		if(!checkout)
			println("We should check out first.");
		try {
			checkout();
			super.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		TestFinalize tf = new TestFinalize("John");
		tf.checkout();
		//Create 1000 Objs to force GC.
		for (int i = 0; i<1000; i++) {
			TestFinalize tf1 = new TestFinalize("Jane");
		}

		System.gc();
		
	}

}
