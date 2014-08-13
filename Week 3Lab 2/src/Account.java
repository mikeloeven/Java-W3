//imports

import java.sql.Time;
import java.util.Date;
public class Account {
//private values 	
	private int id = 0;
	private double ballance =0.0;
	
	//stored as a double but needs to be entered as a percentage for user friendlyness
	private double annualInterestRate = 0.0;
	//generate once on creation read only
	private Date dateCreated = new Date();
	
	
	
//Constructors
	//empty
	Account(){}
	//partials
	Account(int ID)
	{
		this.id = ID;
	}
	
	Account(int ID, double BALLANCE)
	{
		this.id = ID;
		this.ballance = BALLANCE;
	}
	//complete
	Account(int ID, double BALLANCE, double ANNUALINTERESTRATE)
	{
		this.id = ID;
		this.ballance = BALLANCE;
		this.annualInterestRate=(ANNUALINTERESTRATE/100);
	}



	
//Accessors
	
	public int getId() {
		return id;
	}
	
	public double getBallance() {
		return ballance;
	}
	
	public double getAnnualInterestRate() {
		return (annualInterestRate*100);
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
//mutators
	
	public void setId(int id) {
		this.id = id;
	}

	public void setBallance(double ballance) {
		this.ballance = ballance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = (annualInterestRate/100);
	}	
	
//methods
	//returns monthly interest rate
	public double getMonthlyInterestRate()
	{
		return (this.annualInterestRate/12);
	}
	//returns monthly interest
	public double getMonthlyInterest()
	{
		return (this.getMonthlyInterestRate()*this.ballance);
	}
	//deposits AMMOUNT into ballance
	public void deposit(double AMMOUNT)
	{
		
		this.ballance += AMMOUNT;
		System.out.println("Deposit Of $"+AMMOUNT+" Was Successfull, The New Ballance Is $"+this.ballance);
		
	}
	//withdraws AMMOUNT from ballance
	public void withdraw(double AMMOUNT)
	{
		this.ballance += AMMOUNT;
		System.out.println("Withdrawl Of $"+AMMOUNT+" Was Successfull, The New Ballance Is $"+this.ballance);
	}
	

}
