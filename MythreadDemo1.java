package com.mypack.threads;

public class MythreadDemo1 extends Thread{

	 @Override
	public void run() {
		System.out.println("run this hell");
		System.out.println("runmethod"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		MythreadDemo1 demo1=new MythreadDemo1();
		//demo1.run();
		demo1.start();
		System.out.println("main"+Thread.currentThread().getName());

	}

}
