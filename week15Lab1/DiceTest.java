package week15Lab1;

public class DiceTest 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		for(int i = 0; i <= 25; i++)
		{
			Runnable D1 = new Dice();
			Thread d1 = new Thread(D1);
			d1.setName("Dice 1 Throws " + i);
			d1.start();
			
			Runnable D2 = new Dice();
			Thread d2 = new Thread(D2);
			d2.setName("Dice 2 Throws " + i);
			d2.start();
		}
		System.out.println("Finish");
	}
}
