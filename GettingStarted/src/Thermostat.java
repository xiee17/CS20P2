	import com.phidget22.*;
	public class Thermostat {
	  public static void main(String[] args) throws Exception {
	      TemperatureSensor temperatureSensor = new TemperatureSensor();
	      DigitalInput redButton = new DigitalInput();
	      DigitalOutput redLED = new DigitalOutput();
	      DigitalInput greenButton = new DigitalInput();
	      DigitalOutput greenLED = new DigitalOutput();
	      redLED.setHubPort(1);
	      redLED.setIsHubPortDevice(true);
	      redButton.setHubPort(0);
	      redButton.setIsHubPortDevice(true);
	      greenLED.setHubPort(4);
	      greenLED.setIsHubPortDevice(true);
	      greenButton.setHubPort(5);
	      greenButton.setIsHubPortDevice(true);
	   
	      redLED.open(1000);
	      redButton.open(1000);
	      greenLED.open(1000);
	      greenButton.open(1000);
	      temperatureSensor.open(1000);
	    
	      boolean prevGreenButtonState = false;
	      boolean prevRedButtonState = false;
	      double setTemp = 21;
	      while (true) {
	          boolean currentRedButtonState = redButton.getState();
	          boolean currentGreenButtonState = greenButton.getState();
	  
	          if (currentRedButtonState && ! prevRedButtonState ) {
	              setTemp = setTemp - 1;      
	          }
	          if (currentGreenButtonState && ! prevGreenButtonState ) {
	              setTemp = setTemp + 1;
	              }
	         
	          prevRedButtonState = currentRedButtonState;
	          prevGreenButtonState = currentGreenButtonState;
	        
	          double currentTemp = temperatureSensor.getTemperature();
	      
	          if (Math.abs(currentTemp - setTemp) <= 2.0) {
	          	greenLED.setState(true);
	          	redLED.setState(false);
	          }
	          else {
	          	redLED.setState(true);
	          	greenLED.setState(false);
	          }
	      
	          System.out.println("Set temperature is: " + setTemp + " °C");
	          System.out.println("[Current temperature: " + currentTemp + " °C]");
	          System.out.println(" ");
	          Thread.sleep(100);
	      
	          		
	      }
	  }
	}


