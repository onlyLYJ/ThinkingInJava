package Condition;
import static util.Print.*;


/*Exercise 4: (3) Write a program that uses two nested for loops and the modulus
operator (%) to detect and print prime numbers (integral numbers that are not evenly
divisible by any other numbers except for themselves and 1).*/

public class Ex4_TestPrime {
	
	
	
	private static boolean isPrime(int num) {
		valify(num);
		if (num == 0 || num == 1) {
			println(num + " is not a prime number.");
			return false;
		}
		if (num == 2) {
			println(num + " is a prime number.");
			return true;
		}
		
		for (int i = 2; i < num/2+1; i++) {
			if (num % i == 0) {
				println(num + " is not a prime number.");
				println(num + " % " + i + " = " + num % i );
				return false;
			}
		}
		
		println(num + " is a prime number.");
		return true;
	}
	
	private static void valify(int num) {
		if ( num < 0 )
			throw new IllegalArgumentException("Pls insert a number bigger than 0");
	}
	
	
	

	public static void main(String args[]) {
		
		int count = 0;
		for (int i = 0; i<10; i++) {
			if(isPrime(i))
				count++;
		}
		println(count);

		
	}



}
