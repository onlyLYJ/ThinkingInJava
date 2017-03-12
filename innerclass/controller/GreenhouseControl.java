package controller;

public class GreenhouseControl extends GreenhouseControls {

	private String waterMist = "on";
	
	public class waterMistOn extends Event {
		public waterMistOn(long delayTime) {	
			super(delayTime);
		}
		public void action() {
			waterMist = "on";
		}
		public String toString() {return "waterMist is on";}
	}
	
	public class waterMistOff extends Event {
		public waterMistOff(long delayTime) {	
			super(delayTime);
		}
		public void action() {
			waterMist = "off";
		}
		public String toString() {return "waterMist is off";}
	}
	
	
}
