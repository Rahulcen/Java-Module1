package Multithreading;

public class TestRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable runnable=new MyRunnable();
		Thread t1=new Thread(runnable);
		Thread t2=new Thread(runnable);
		t1.start();
		t2.start();

	}

}
