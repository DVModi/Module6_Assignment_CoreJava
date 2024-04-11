package com.codewithdeepa;
public class ThreadRunnableInterface implements Runnable {

public void run() {
	System.out.println("Thread is running");
}

 
	public static void main(String[] args) {
		ThreadRunnableInterface ex = new ThreadRunnableInterface();
		Thread t1=new Thread(ex);
		t1.start();
		System.out.println("Hello");
	}

}
