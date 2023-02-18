package multithreading;

class Work
{
	String cricketer;
	synchronized void  greet(String cricketer)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Congrats by "+cricketer+" to " );
		}
	}
}

class Cricket extends Thread
{
	Work w;
	String cricketer;
	public  Cricket(Work w,String cricketer)
	{
		this.w=w;
		this.cricketer=cricketer;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	  w.greet(this.cricketer);
	}
}

public class CricketDemo {

	public static void main(String[] args) {
		
		Work ws=new Work();
		
		Cricket v1=new Cricket(ws,"Viart Kohli");
		Cricket v2=new Cricket(ws,"Umran Malik");
		Cricket v3=new Cricket(ws,"Rohit SHarma");
		Cricket v4=new Cricket(ws,"Ishan Kishan");
		
		v1.start();
		v2.start();
		v3.start();
		v4.start();
		

	}

}
