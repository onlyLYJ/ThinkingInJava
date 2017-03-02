package newPackage;

import innerclass.Inter1;

public class Other1 {
	
	protected class inOther implements Inter1 {

		private String s = "ok";
		public inOther() {
			
		}

		@Override
		public void play() {
			System.out.println(s);
		}
		
	}
	
	void display() {
		//s += " "; Cannot access the private field of Inner Class
	}
	
}
