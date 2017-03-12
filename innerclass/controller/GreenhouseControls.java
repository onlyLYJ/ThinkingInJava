package controller;

public class GreenhouseControls extends Controller {

	private boolean light = false;
	
	public class LightOn extends Event {
		public LightOn(long delayTime) { super(delayTime); }
		public void action() {
			light = true;
		}
		public String toString() { return "Light is on"; }
	}
	
	public class LightOff extends Event {
		public LightOff(long delayTime) { super(delayTime); }
		public void action() {
			light = false;
		}
		public String toString() { return "Light is off"; }
	}
	
	
	private boolean water = false;
	
	public class WaterOn extends Event {
		public WaterOn(long delayTime) { super(delayTime); }
		public void action() {
			water = true;
		}
		public String toString() {
			return "Greenhouse water is on";
		}
	}
	
	public class WaterOff extends Event {
		public WaterOff(long delayTime) { super(delayTime); }
		public void action() {
			water = false;
		}
		public String toString() {
			return "Greenhouse water is off";
		}
	}

	private String thermostat = "Day"; 
	public class ThermostatNight extends Event {
		public ThermostatNight(long delayTime) {
			super(delayTime);
		}
		public void action() {
			thermostat = "Night";
		}
		public String toString() {return "Thermostat on night setting";}
	}
	
	public class ThermostatDay extends Event {
		public ThermostatDay(long delayTime) {	
			super(delayTime);
		}
		public void action() {
			thermostat = "Day";
		}
		public String toString() {return "Thermostat on day setting";}
	}
	
	private String Fan = "on"; 
	
	public class FanOn extends Event {
		public FanOn(long delayTime) {	
			super(delayTime);
		}
		public void action() {
			Fan = "on";
		}
		public String toString() {return "Fan is on";}
	}
	
	public class FanOff extends Event {
		public FanOff(long delayTime) {	
			super(delayTime);
		}
		public void action() {
			Fan = "off";
		}
		public String toString() {return "Fan is off";}
	}
	
	
}
