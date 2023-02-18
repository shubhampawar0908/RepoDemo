package multithreading;


class Multithread implements Runnable
{

	@Override
	public void run() {
		for(int i=0;i<=5;i++)
		{
			System.out.println("Task is running");
		}
		
	}
	
}

public class RunnableDemo {

	public static void main(String[] args) {
		
		
		
		Multithread m=new Multithread();
		
		Thread bh=new Thread(m);

		bh.start();
		for(int i=0;i<=5;i++)
		{
			System.out.println("main method is running");
		}
		
		

	}

}
