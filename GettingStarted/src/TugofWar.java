import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

public class TugofWar {
	public static void main(String[] args) throws Exception{
		DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();
        
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        
        int redCount = 0;
        int greenCount = 0;
        
        boolean RedState0 = false;
        boolean GreenState0 = false;
        
        while (redCount < 10 && greenCount <10) {
        	boolean redState = redButton.getState();
        	boolean greenState = greenButton.getState();
        	
        	if (redState && ! RedState0) {
        		redCount++;
        		System.out.println("Red count: " + redCount);
        	}
        	if (greenState && !GreenState0) {
        		greenCount++;
        		System.out.println("Green count: " + greenCount);
        	}
        	
        	RedState0 = redState;
        	GreenState0 = greenState;
        	
        	Thread.sleep(100);
        }
        redLED.setState(true);
        greenLED.setState(true);
        Thread.sleep(100);
        redLED.setState(false);
        greenLED.setState(false);
        Thread.sleep(100);
        
        if (redCount == 10) {
            for (int i = 0; i < 5; i++) {
                redLED.setState(true);
                Thread.sleep(200);
                redLED.setState(false);
                Thread.sleep(200);
            }
        } else if (greenCount == 10) {
            for (int i = 0; i < 5; i++) {
                greenLED.setState(true);
                Thread.sleep(200);
                greenLED.setState(false);
                Thread.sleep(200);
            }
        }
	}

}
