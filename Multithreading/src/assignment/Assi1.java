package assignment;

import java.util.Random;

class FirstThread extends Thread
{
	Random r=new Random();
	int a;
	

	public void run() {
		for(int i=1;i<=10;i++)
		{
			a=r.nextInt(10);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(a%2==0) {
				SecondThread s=new SecondThread(a);
				s.start();
			}
			else {
				ThirdThread t=new ThirdThread(a);
				t.start();
			}
		}
		
		
		
		
	}
}
class SecondThread extends Thread
{
	FirstThread f;
	int a;
	
	public SecondThread(int a)
	{
		this.f=f;
		this.a=a;
	}
	public void run() {
		
		System.out.println("The square of number is "+(this.a*this.a));
	}
}
class ThirdThread extends Thread
{
	FirstThread f;
	int a;
	
	public ThirdThread(int a)
	{
		this.f=f;
		this.a=a;
	}
	public void run() {
		
		System.out.println("The cube of number is "+(this.a*this.a*this.a));
	}
}


public class Assi1 {

	public static void main(String[] args) {
		
		FirstThread f=new FirstThread();
		f.start();

	}

}
