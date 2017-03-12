package controller;

public abstract class Event {
	
	private long eventTime;
	protected final long delayTime;
	
	public Event(long delayTime) {
		
		this.delayTime = delayTime;
		start();
		
	}

	public void start() {
		eventTime = System.nanoTime() + delayTime;
		System.out.println(eventTime);
	}
	
	public boolean ready() {
		System.out.println(System.nanoTime());
		return System.nanoTime() >= eventTime;
		
	}
	
	public abstract void action();
	

	

}
