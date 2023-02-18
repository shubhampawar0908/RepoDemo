package multithreading;

class Xyz extends Thread
{
	@Override
	public void run() {
		for(int i=0;i<=4;i++)
		{
			
			System.out.println("Hi");
			Thread.yield();
		}
		
		
	}
}

public class YieldDemo {

	public static void main(String[] args) {
		
		Xyz x=new Xyz();
		
		x.start();
		
		for(int i=0;i<=4;i++)
		{
			System.out.println("Heyyyy");
		}
		
		

	}

}
