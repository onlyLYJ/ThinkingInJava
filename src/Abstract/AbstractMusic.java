package Abstract;


public abstract class AbstractMusic implements Music {
	
	public void play() {
		System.out.println(this + " is playing");
	}
	
	public void adjust() {
		System.out.println(this + " is adjusting");
	}
	
	public void end() {
		System.out.println(this + " ended");
	}

}
