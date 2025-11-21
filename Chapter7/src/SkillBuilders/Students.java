package SkillBuilders;

public class Students {
	
	private String firstName;
	private String lastName;
	private String address;
	private int StuID;
	
	public Students() // constructor Method
	{
		firstName = "unknown";
		lastName = "unknown";
		address = "unknown";
		StuID = 00000;
	}
	public Students(String f, String l, String ad, int id)//Overload Constructor method
	{
		firstName = f;
		lastName = l;
		address = ad;
		StuID = id;
	}
//Accessor method
	public String getFirstName()
	{
		return firstName;
	}
//modifier methods
	public void setFirstName(String f)
	{
		firstName = f;
	}
	
	public String toString()
	{
		return("First Name: "+ firstName
				+ "\nLast name: "+ lastName
				+"\nAddress: "+ address
				+"\nStudent ID: "+ StuID);
	}
}
