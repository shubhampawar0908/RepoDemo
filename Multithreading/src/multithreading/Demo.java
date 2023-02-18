package multithreading;
class Basic extends Thread
{
	int j=12;
	
	
	public void run() {
		// TODO Auto-generated method stub
	for(int i=0;i<=5;i++)
	{
		System.out.println("Heyyy");
	}
	}
	
}

public class Demo {

	public static void main(String[] args) {
		
		
		Basic b=new Basic();
		b.start();
		for(int k=0;k<=5;k++)
		{
			System.out.println("Hiiiii");
		}
		
	}

}
