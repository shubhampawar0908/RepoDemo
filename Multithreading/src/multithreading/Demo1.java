package multithreading;

public class Demo1 extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=2;i<=2;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i*j);
			}
		}
	}

	public static void main(String[] args) {
		
		
		Demo1 d=new Demo1();
		d.start();
		for(int i=3;i<=3;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i*j);
			}
		}

		
		

	}

}
