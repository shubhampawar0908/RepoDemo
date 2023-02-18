package multithreading;

class Abc extends Thread
{
  
public void run() {
	
	for(int i=0;i<=4;i++)
	{
		System.out.println(Thread.currentThread().getName());
		
		
	}
}	
}

public class ThreadClassAndMethods {
	

	public static void main(String[] args) {
		
		
		Abc a=new Abc ();
		//Thread th=new Thread(a);
	
		Thread.currentThread().setName("MainThread1");
		a.setName("Shubham");
	//	th.start();
		a.start();
		
	/*	System.out.println(a.getName()); // Shubham
		System.out.println(a.currentThread().getName()); //same  output MainThread1
		System.out.println(Thread.currentThread().getName());//same   MainThread1
		System.out.println(th.currentThread().getName()); //same     MainThread1
		*/
	System.out.println(Thread.currentThread().getName());
		
	  // System.out.println((a.getName()));
		for (int i=0;i<=4;i++)
		{
		System.out.println("Main Thread");			
	}
		// System.out.println( a.currentThread());  //same1 output
		// System.out.println(Thread.currentThread()); // same1  output
		
		
	
	
	}

}
