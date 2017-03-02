package Interface;

public interface GameFactory {

	GambleGame getGame();

}


class CoinFactory implements GameFactory {

	@Override
	public GambleGame getGame() {
		return new CoinGame();
	}
	
}

class DiceFactory implements GameFactory {

	@Override
	public GambleGame getGame() {
		return new DiceGame();
	}
	
}