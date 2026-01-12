import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;

public class HotorCold {
	 public static void main(String[] args) throws Exception
	 {

	        DigitalOutput redLED = new DigitalOutput();
	        DigitalOutput greenLED = new DigitalOutput();
	        TemperatureSensor temperatureSensor = new TemperatureSensor();
	        
	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);
	        greenLED.setHubPort(4);
	        greenLED.setIsHubPortDevice(true);

	     
	        redLED.open(1000);
	        greenLED.open(1000);
	        temperatureSensor.open(1000);
	        
	        double temp;
	       
	        while(true) 
	        { 
	        	temp = temperatureSensor.getTemperature();
	        	
	        	if(temp >= 20  && temp <= 24) 
	        	{
	        		greenLED.setState(true);
	                
	                redLED.setState(false);
	               
	        
	        	}
	        	
	        	else 
	        	{ 
	        		System.out.println("Temperature:" + temp + "°C");
	        		greenLED.setState(false);
	                
	                redLED.setState(true);
	                
	        	}
	        	
	        	Thread.sleep(150);
	 }
	        
	 }
}

