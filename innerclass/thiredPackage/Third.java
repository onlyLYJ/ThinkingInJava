package thiredPackage;

import innerclass.Inter1;
import newPackage.Other1;

public class Third extends Other1 {

	
	Inter1 thirdPlay() {
		return (Inter1) new inOther();	
	}
	
	public static void main(String args[]) {
		Third t = new Third();
		t.thirdPlay().play();
	}
}
