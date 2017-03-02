package Interface;

public class DiceGame extends GambleGame {

	
	String getNumber() {
		return random.nextInt(6)+1 +" point";
	}
	

}
