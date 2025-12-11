package SkillBuilders;

public class circle {
	private static final double PI = 3.14;
	private double radius;
	
	public circle()//default constructor method
	{
		radius = 1;
	}
	public circle(double r) {
		radius = r;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double r)
	{
		radius = r;
	}
	public double Area()
	{
		double circArea = PI * radius * radius;
		return circArea;
	}
	public double circumference()
	{
		double circ = 2 * PI *radius;
		return circ;
	}
	
	public String toString()
	{
		return("The radius is: " + radius);
	}

}
