package week15Lab1;

public class Dice implements Runnable
{
	public long dice;
	String string;
	int total;
	
	public Dice()
	{
	}
	
	public int Throw()
	{
		int random = 1 + (int)(Math.random() * 6);
		return random;
	}
	
	public int Throw(int bounce) throws Exception
	{
		if(bounce > 3)
		{
			throw new Exception("too many ");
		}
		else
		{
			total = 0;
			for(int b = bounce; b > 0; b--)
			{
				int dice = (int)(1 + (Math.random() * 6));
				System.out.printf("%d\n", dice);
				total = total + dice;
			}
			System.out.printf("this is the total %d\n", total);
			return total;
		}
	}
	
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		
		for(int i = 0; i < 25; i++)
		{
			string = " " + this.Throw();
		}
		
		System.out.println(string);
	}
}

