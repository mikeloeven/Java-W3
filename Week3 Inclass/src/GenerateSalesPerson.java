import java.util.Scanner;

public class GenerateSalesPerson
{
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter the Full Name of SalesPerson #1\n");
		SalesPerson dude1 = new SalesPerson(keyboard.next(),keyboard.next());
		dude1.printFullnName();
		
		SalesPerson dude2 = new SalesPerson();
		dude2.setFirstName("John");
		dude2.setLastName("Doe");
		
		Boolean dudeCompare = dude1.equals(dude2);
		
		if (dudeCompare == true)
		{
			System.out.println("The SalesPerson Exists");
		}
		else
		{
			System.out.println("The SalesPerson Does Not Exist");
		}
		
		float Commission = SalesPerson.calculateCommission(0.5f, 100);
		System.out.println("The Sales Commission is: "+Commission);
	
		System.out.println("\nLiscense Plate Is: "+liscenseplate.genLiscense());
		
		
	}
}

