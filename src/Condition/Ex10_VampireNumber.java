package Condition;
import static util.Print.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Exercise 10: (5) A vampire number has an even number of digits and is formed by
multiplying a pair of numbers containing half the number of digits of the result. The digits
are taken from the original number in any order. Pairs of trailing zeroes are not allowed.
Examples include:
1260 = 21 * 60
1827 = 21 * 87
2187 = 27 * 81
Write a program that finds all the 4-digit vampire numbers. */

public class Ex10_VampireNumber {
	

	private static int vam;
	private static List<Integer> vampireNumbers(int begin, int end) {
		List<Integer> res = new ArrayList<Integer>();
		for (int i = begin; i<=end; i++ ) {
			if(isVampire(i))
				res.add(i);
		}
		return res;
	}

	private static boolean isVampire(int i) {
		int[] arr = getIntArray(i);
		int a = arr[0];
		int b = arr[1];
		int c = arr[2];
		int d = arr[3];
		vam = i;
		return (   check(a,b,c,d) ||check(b,a,c,d)||check(a,b,d,c)||check(b,a,d,c)
				|| check(a,c,b,d) ||check(c,a,b,d)||check(a,c,d,b)||check(c,a,d,b)
				|| check(a,d,b,c) ||check(d,a,b,c)||check(a,d,c,b)||check(d,a,c,b));				
	}
	
	private static int[] getIntArray(int i) {
		String n = i+"";
		int[] num = new int[4];
		int num0 = (char) '0';
		for (int j=0; j<n.length(); j++) {
			num[j] = n.charAt(j)-num0;
		}
		return num;
	}

	private static boolean check(int a, int b, int c, int d) {
		int n = 1;
		if (a!=0 && c!=0) 
			n = (10 * a + b) * (10*c + d);
		return n==vam;
	}
	
	
//方法2：	
   public static void Vam(int begin,int end) {
	   int bg = checkAndGetBegin(begin);
	   int ed = checkAndGetEnd(end);
	   int count = 0;
       for(int i = bg; i <= ed; i++){
           for(int j = bg; j<= ed; j++){
                int sun = i*j;
                if(sun >=begin && sun <= end){
                    String [] str = String.valueOf(sun).split("");
                    Arrays.sort(str);    //按照字符的升序排列
                    String [] str1 = (String.valueOf(i)+String.valueOf(j)).split("");
                    Arrays.sort(str1);    //对两个Arrays进行比较
                    //2个尾数都为0的数字不算,否则21*60=1260, 210*600=126000也是成立的
                    if(Arrays.equals(str, str1) && (i%10!=0 || j%10!=0)){
                    	if(i <= j && checkLenth(i,j)){
                    		println(i+"*"+j+"="+i*j);
                    		count++;
                    	}
                    }
                }
            }
        }
       println("TTL " + count + " VAMPIRES");

    }

	private static boolean checkLenth(int i, int j) {
		return getLenth(i)== getLenth(j);
	}

	private static int getLenth(int i) {
		String n = i+"";
		return n.length();
	}

	private static int checkAndGetBegin(int begin) {
	   int bg = getLenth(begin);
	   if (bg < 3)
		   throw new IllegalArgumentException("Begin number shall > 100");
	   return (int) Math.pow(10,bg/2-1);
	}

	private static int checkAndGetEnd(int end) {
	   int ed = getLenth(end);
	   if (ed < 3)
		   throw new IllegalArgumentException("End number shall > 100");
	   return (int) Math.pow(10, ed/2)-1;
	}


	public static void main(String args[]) {
		print(vampireNumbers(1000,9999));
		Vam(100,188888);
	}



}
