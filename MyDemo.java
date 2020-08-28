package com.mypack.threads;

class MyDemo1 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
		System.out.println("run2 method");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
}
class MyDemo implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
		System.out.println("run method");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
public static void main(String[] args) {
	MyDemo m=new MyDemo();
	MyDemo1 m1=new MyDemo1();
	Thread t=new Thread(m);
	Thread t1=new Thread(m1);
	t.start();
	t1.start();
}}