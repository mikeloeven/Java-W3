
public class SalesPerson {
	
	private String firstName;
	private String lastName;
	
	
	public SalesPerson(){}
	public SalesPerson(String fName,String lName)
	{
		this.firstName = fName;
		this.lastName = lName;
	}
	
	//get set fname
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	//get set lname
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	//prints full name
	public void printFullnName()
	{
	
		StringBuilder fullName = new StringBuilder();
		fullName.append(this.firstName).append(" ").append(this.lastName);
		System.out.println(fullName.toString());
		
	}
	
	//compares two salesperson
	public boolean equals(SalesPerson P1)
	{
		if(P1.getFirstName().equals(this.getFirstName())&&P1.getLastName().equals(this.getLastName()))
		return true;
		else
		return false;
	}
	
	public static float calculateCommission(float rate, int sales)
	{
		
		return rate * sales;
		
	}
	

}
