package assignment;

import java.util.Scanner;

class User {
	String s;

	synchronized void acceptUser(String s) {
		this.s = s;
		
	}
}

class Red extends Thread {
	User u;
	String s;

	public Red(User u, String s) {
		this.u = u;
		this.s = s;
	}

	@Override
	public void run() {
		if (this.s.equals("red")) {
			System.out.println("please stop");

		}
		else {
			System.out.println("Invalid Input");
		}
		

	}

}

class Green extends Thread {

	User u;
	String s;

	public Green(User u, String s) {
		this.u = u;
		this.s = s;
	}

	@Override
	public void run() {
		if (this.s.equals("green")) {
			System.out.println("please go");

		}
		else {
			System.out.println("Invalid Input");
		}
	}
}

class Yellow extends Thread {
	User u;
	String s;

	public Yellow(User u, String s) {
		this.u = u;
		this.s = s;
	}

	@Override
	public void run() {
		if (this.s.equals("yellow")) {
			System.out.println("wait and go");

		}
		else {
			System.out.println("Invalid Input");
		}
	}
}

public class Assi2 {

	public static void main(String[] args) {

		User us1 = new User();
		//User us2 = new User();
	//	User us3 = new User();
//      System.out.println("Enter signal");
//      Scanner sc=new Scanner(System.in);
//		String m=sc.nextLine();
//		String n=sc.next();
	//	String o=sc.next();
		Red re = new Red(us1, "red");
		Green ge = new Green(us1, "green");
		Yellow ye = new Yellow(us1, "yellow");
		re.start();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ge.start();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ye.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
