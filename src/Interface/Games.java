package Interface;

/*Exercise 19: (3) Create a framework using Factory Methods that performs both coin
tossing and dice tossing.*/

public class Games {
	
	
	
	public static void playGame(GameFactory factory) {
		GambleGame gg = factory.getGame();
		gg.play();
	}

	public static void main(String args[]) {
		
		playGame(new CoinFactory());
		playGame(new DiceFactory());
		
	}
	

}
