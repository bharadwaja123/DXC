package com.mypack.threads;

public class MyThreadDemo2 extends Thread {
@Override
public void run() {
	System.out.println("run method");
	System.out.println(Thread.currentThread().getName());
for(int i=0;i<10;i++)
{
	System.out.println(i);
}
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	e.printStackTrace();
}}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MyThreadDemo2 demo2=new MyThreadDemo2();
      demo2.start();
	}

}
