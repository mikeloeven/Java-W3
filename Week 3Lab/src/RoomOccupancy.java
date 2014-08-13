
public class RoomOccupancy {
	//number of people in current room
	private int numberInRoom;
	//number of people across all rooms
	private static int totalNumber;
	
	
	//empty constructor
	public RoomOccupancy(){}
	
	//returns people number of people in current room
	public int getNumber() 
	{
		return numberInRoom;
	}
	
	//returns total people across all rooms
	public static int getTotal()
	{
		return totalNumber;
	}
	
	
	//increases room occupancy and totals
	public void addOneToRoom()
	{
		numberInRoom++; 
		totalNumber++;
		System.out.println("Occupant Added");
		
	}
	
	
	//decreases room occupancy and totals
	public void removeOneFromRoom()
	{
		if(numberInRoom>0) 
			{
				numberInRoom--;
				totalNumber--;
				System.out.println("Occupant Removed");
			}
		else
			{
				System.out.println("The Room Is Already Empty");
			}
	}
	
	
	
	
	
}
