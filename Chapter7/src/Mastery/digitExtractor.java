package Mastery;

public class digitExtractor {
private int integer;
	
	public void setNumber(int num) {
		integer = num;
	}
	public int getWhole() {
		return integer;
	}
	public int getOnes() {
		return (integer % 10) ;
	}
	public int getTens() {
		return (integer / 10) % 10;
	}
	public int getHundreds() {
		return (integer / 100) % 10;
	}

}
