package com.mypack.threads;

class hare implements Runnable
{
	int i=0;
	@Override
	public void run() {
		for(i=0;i<=100;i++)
		{
			if(i>=90 && i<=100)
			{
				System.out.println("Hare Sleeps...."+i);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}}
				else
				{
			System.out.println("Hare....."+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
				}
			if(i==100)
				System.out.println("Hare wins......"+i);
			}
		}
	boolean isAlive() {
		if(i==100)
		return true;
		else
		return false;
		
	}
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	}

class tortoise implements Runnable
{
	int i=0;
	@Override
	public void run() {
		
		for(i=0;i<=100;i++)
		{
			System.out.println("Tortoise...."+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==100)
				System.out.println("Tortoise wins the race...."+i);
		}
	}
	boolean isAlive() {
		if(i==100)
		return true;
		else
		return false;
		
	}
}

public class Task1 {
public static void main(String[] args) {
	hare h=new hare();
	tortoise t=new tortoise();
	
	Thread th1=new Thread(h);
	Thread th2=new Thread(t);
	
	th1.start(); // h is alive
	th2.start(); // t is alive
	while(true)
	{
		if(!(th1.isAlive()))
		{
			System.out.println("Hare has won the race!!!");		
			th2.stop();
			break;
		}
		if(!(th2.isAlive()))
		{
			System.out.println("Tortoise has won the race!!!");
			th1.stop();
			break;
		}
	}

	
	System.out.println("Main ends");
}
}


