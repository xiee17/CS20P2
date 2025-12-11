package SkillBuilders;

public class TestCircle {
	public static void main(String [] args) {
		circle spot = new circle(7.1);
		circle spot1 = new circle(7.1);
		
		
		
		System.out.println(spot.getRadius());
		System.out.println(spot.circumference());
		System.out.println(spot.Area());
		
		System.out.println(spot);
		
		if(spot.equals(spot1))
		{
			System.out.println("spot and spot1 are equal.");
		}
		else
		{
			System.out.println("spot and spot1 are not equal.");
		}
	}

}