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
		
/*Output:		fisrt 7 is smaller than sec 65
		fisrt 65 is smaller than sec 97
		fisrt 97 is bigger than sec 24
		fisrt 24 is smaller than sec 62
		fisrt 62 is bigger than sec 44
		fisrt 44 is bigger than sec 1
		fisrt 1 is smaller than sec 30
		fisrt 30 is smaller than sec 73
		fisrt 73 is bigger than sec 13
		fisrt 13 is smaller than sec 79
		fisrt 79 is smaller than sec 94
		fisrt 94 is bigger than sec 39
		fisrt 39 is bigger than sec 12
		fisrt 12 is smaller than sec 98
		BINGOOOOOO!!!
		fisrt 98 is equal to sec 98
		fisrt 98 is bigger than sec 59
		fisrt 59 is bigger than sec 13
		fisrt 13 is smaller than sec 19
		fisrt 19 is smaller than sec 20
		fisrt 20 is smaller than sec 76
		fisrt 76 is bigger than sec 38
		fisrt 38 is smaller than sec 86
		fisrt 86 is smaller than sec 94
		fisrt 94 is bigger than sec 60*/

		
	}

}
