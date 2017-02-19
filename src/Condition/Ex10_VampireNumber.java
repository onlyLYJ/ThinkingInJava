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
		println("");
		Vam(100,188888);
	}

/*Output:	[1260, 1395, 1435, 1530, 1827, 2187, 6880]
 * 			15*93=1395
			21*60=1260
			21*87=1827
			27*81=2187
			30*51=1530
			35*41=1435
			80*86=6880
			135*801=108135
			140*926=129640
			141*840=118440
			146*938=136948
			150*705=105750
			152*761=115672
			152*824=125248
			156*942=146952
			158*701=110758
			161*725=116725
			165*951=156915
			167*701=117067
			176*926=162976
			179*725=129775
			201*510=102510
			201*600=120600
			201*627=126027
			201*897=180297
			204*516=105264
			204*615=125460
			210*501=105210
			215*635=136525
			216*864=186624
			221*782=172822
			225*801=180225
			225*810=182250
			231*534=123354
			231*543=125433
			231*588=135828
			231*750=173250
			231*759=175329
			240*651=156240
			246*510=125460
			251*500=125500
			251*608=152608
			260*401=104260
			261*486=126846
			261*585=152685
			269*581=156289
			281*443=124483
			281*650=182650
			300*501=150300
			311*422=131242
			315*423=133245
			317*425=134725
			317*461=146137
			323*410=132430
			350*401=140350
			351*387=135837
			351*414=145314
			356*431=153436
			371*470=174370
			396*414=163944
			TTL 60 VAMPIRES*/

}
