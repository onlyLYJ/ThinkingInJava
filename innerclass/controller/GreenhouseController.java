package controller;
//Exercise 25: (3) Inherit from GreenhouseControls in GreenhouseControls.java
//to add Event inner classes that turn water mist generators on and off. Write a new version of
//GreenhouseController.java to use these new Event objects.
public class GreenhouseController {
	
	public static void main(String[] args) {
		//GreenhouseControls gc = new GreenhouseControls();
		GreenhouseControl gc = new GreenhouseControl();
		Event[] eventList = {
		gc.new ThermostatNight(Long.MAX_VALUE),
		gc.new LightOn(200),
		gc.new LightOff(400),
		gc.new WaterOn(600),
		gc.new WaterOff(Long.MAX_VALUE),
		gc.new ThermostatDay(1400),
		gc.new FanOn(100000),
		gc.new FanOff(9000),
		gc.new waterMistOn(9000),
		gc.new waterMistOff(9000),
		}; 
	//gc.addEvent(gc.new Restart(2000, eventList));

		for (int i = 0; i < eventList.length; i++) {
			gc.addEvent(eventList[i]);
		}
		
		gc.run();
	}
}