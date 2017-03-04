



public interface ClassInInterface {
	void howdy();
	
	class Test  {

		public static void ok(ClassInInterface ci) {
			ci.howdy();
		}
		
		public void howdy1() {
		
			System.out.println("Howdy!");
		}
	
	}
}