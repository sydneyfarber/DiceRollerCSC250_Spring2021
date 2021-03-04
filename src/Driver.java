import java.util.Random;

public class Driver
{	
	public static void main(String[] args) 
	{
		Dice d6 = new Dice(6);
		Dice d8 = new Dice(8);
				
		System.out.println(d6.roll());
		System.out.println(d8.roll());
		
		for(int i = 0; i < 20; i++)
		{
			System.out.println(d6.roll());
		}
				
	}
	
}  
