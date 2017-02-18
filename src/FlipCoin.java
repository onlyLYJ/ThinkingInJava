import java.util.Random;

public class FlipCoin {
	
	public static void flip(int n){
		Random a = new Random();
		int countHead = 0;
		int num = 0;
		String side = "";
		for(int i = 0; i < n; i++) {
			num = a.nextInt(2);
			if (num < 1){
				countHead++;
				side = "Head";
			} else {
				side = "Tail";
			}
			
			System.out.println("You flip a "+ side);
		}
		float ratio = (float) countHead/n;
		System.out.printf("the ratio of head is %4.2f%%" , ratio*100);
		
	}
	
	public static void main(String args[]) {
		flip(50000);
	}
	
	
}
