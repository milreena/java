import java.util.Random;
public class Number extends Thread
{
	private int number;
	public void run()
	{
		Random r=new Random();
		
	
		for(int i=0;i<5;i++)
		{
			number=r.nextInt(20);
			System.out.println("Number generated is "+number);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
				
			}
			Squarenumber s=new Squarenumber(number);
			s.start();
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
				
			}
			Cubenumber c=new Cubenumber(number);
			c.start();
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
				
			}
			System.out.println("\n");
		}
	}
}
