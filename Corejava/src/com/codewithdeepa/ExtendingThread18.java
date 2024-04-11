package com.codewithdeepa;
class ExtendingThread18 extends Thread{
	public void run()
	{
		System.out.println("Thread is running");
}
	public static void main(String []args) {
		ExtendingThread18 t1=new ExtendingThread18();
		t1.start();
	}

}
