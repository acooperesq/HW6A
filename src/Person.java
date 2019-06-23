public class Person {

	
	private String firstName; // store the first name
	
	private String lastName;
	
	public Person () // Default constructor
	
		{
		firstName = "";
		lastName = "";
		}
	
	public Person(String first, String last)   // Constructor with parameters
	{
		setName(first, last);
		
	}
	
	public String toString()
	{
		return (firstName + " " + lastName);
	}
	
	public void setName (String first, String last)
	{
		firstName = first;
		lastName = last;
		
	} 
	
	public String getFirstName()
	
	{
		return firstName;
	}
	
	
	public String getLastname()
	
	{
		return lastName;
	}
	
}

