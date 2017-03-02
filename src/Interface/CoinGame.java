package Interface;

public class CoinGame extends GambleGame {

	
	String getNumber() {
	
		return random.nextInt(2) == 1 ? "a head." : "a tail";
	}
	

}
