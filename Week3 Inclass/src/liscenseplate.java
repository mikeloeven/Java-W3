
public class liscenseplate {
	
	
	public static String genLiscense()
	{
	StringBuilder plate = new StringBuilder();
	for(int i=0;i<3;i++)
	{
		plate.append(randASCII());
	}
	for(int i=0;i<4;i++)
	{
		plate.append(String.valueOf(randNum()));
	}
	
	
	return plate.toString();
	}
	
	
	
	private static String randASCII()
	{
		char C = (char)rand(100, 65, 90);
		
		
		return String.valueOf(C);
	}
	
	private static int randNum()
	{
		
		return rand(10,1,9);
		
	}
	
			
	
	private static int rand(int multi,int min, int max)
	{
		int r = (int)(Math.random() * multi);
		do
		{
			r=(int)(Math.random() * multi);
		}while(r>max||r<min);
		return r;
	}
	
	
}
