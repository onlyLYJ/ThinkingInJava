package Interface;

import java.util.Random;

public abstract class GambleGame {
	
	public Random random = new Random();
	
	abstract String getNumber();
	
	void play() {
		System.out.println(getClass().getSimpleName() + ": You got " + getNumber());
	};

}
