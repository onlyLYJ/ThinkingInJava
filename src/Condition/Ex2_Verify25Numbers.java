package Condition;

import java.util.Random;
import static util.Print.*;

/*Exercise 2: (2) Write a program that generates 25 random int values. For each value,
use an if-else statement to classify it as greater than, less than, or equal to a second
randomly generated value.*/

public class Ex2_Verify25Numbers {
	
	public static void verify25Numbers(Random rand,int bound) {
		int first = rand.nextInt(bound);
		int sec = 0;
		for (int i = 1; i < 25; i++) {
			sec = rand.nextInt(bound);
			printCheck(first,sec);
			first = sec;
		}
	}
	
	@SuppressWarnings("static-access")
	private static void printCheck(int first, int sec) {
		int result = first - sec;
		if (result > 0) {
			println("fisrt " + first + " is bigger than sec "+ sec);
		} else if (result == 0) {
			println("BINGOOOOOO!!!");
			println("fisrt " + first + " is equal to sec "+ sec);
			Thread t = new Thread();
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			println("fisrt " + first + " is smaller than sec "+ sec);
		}
		
	}

	public static void main(String args[]) {
		Random rand = new Random();
		int bound = 100;
		verify25Numbers(rand,bound);
		
	}

}
