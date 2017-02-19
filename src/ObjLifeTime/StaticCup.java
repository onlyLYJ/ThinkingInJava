package ObjLifeTime;
import static util.Print.*;


public class StaticCup {
	
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	
	void printCup() {
		println("cup1 num: " + cup1.getNum());
		println("cup2 num: " + cup2.getNum());
	}
	
	public static void main(String args[]) {
		StaticCup.cup1 = new Cup();
		println("=== new cup2 ===");
		StaticCup.cup2 = new Cup();
		println("=== new Obj ===");
		StaticCup sc = new StaticCup();
		sc.printCup();
	}
	
/*Output:	Cup 1
			Cup 2   //static range initialized when used
			Normal Cup  //Cup1 referred to Normal Cup.
			=== new cup2 ===
			Normal Cup   //Cup2 to Normal.
			=== new Obj ===
			cup1 num: 1    //static cup1&2 already been initialized, 
			cup2 num: 1  //new obj will not use static block.

 Conclusion : Static block could run before new Obj by referring to its static obj.
              new Obj will run static block only if it has not run before.
              In other words, static block, if ever been used, will run only once and for all.
*/
}

class Cup {
	
	private int num;
	
	Cup() {
		num = 1;
		println("Normal Cup");
	}
	
	Cup(int i) {
		num = i;
		println("Cup " + i);
	}
	
	public int getNum() {
		return num;
	}
	
}
