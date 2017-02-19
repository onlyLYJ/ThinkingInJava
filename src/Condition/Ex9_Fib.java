package Condition;
import static util.Print.*;

import java.util.ArrayList;
import java.util.List;

/*Exercise 9: (4) A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21,
34, and so on, where each number (from the third on) is the sum of the previous two. Create
a method that takes an integer as an argument and displays that many Fibonacci numbers
starting from the beginning, e.g., If you run java Fibonacci 5 (where Fibonacci is the
name of the class) the output will be: 1, 1, 2, 3, 5.*/

public class Ex9_Fib {
	
	
//	private static int Fib(int i) {
//		if (i==0 || i==1)
//			return 1;
//		return Fib(i-1)+Fib(i-2);
//	}
	
//	public static int[] Fibonacci(int num) {
//		check(num);
//		int[] result = new int[num];
//		int j= 0;
//		for(int i=0; i<num; i++) {
//			j = Fib(i);
//			result[i] = j;
//			print(j);
//			if (i!=num-1)
//				print(", ");	
//		}
//		
//		return result;
//	}
	
	public static List<Long> Fibonacci(int i) {
		List<Long> fib = new ArrayList<Long>();
		check(i);
		fib.add(1L);
		fib.add(1L);
		for (int j=1; j < i-1; j++) {
			Long num = fib.get(j) + fib.get(j-1);
			fib.add(num);
		}
		
		return fib;
	}
	
	
	
	private static void check(int num) {
		if (num<=0) 
			throw new IllegalArgumentException("Pls insert a number bigger than 0.");
		
	}

	public static void main(String args[]) {
		
		print(Fibonacci(11));
		
		
	}



}
