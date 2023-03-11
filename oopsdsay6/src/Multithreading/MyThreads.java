package Multithreading;



public class MyThreads extends Thread {
	
	private String name;
	
	public MyThreads() {
		// TODO Auto-generated constructor stub
	}

	public MyThreads(String name) {
		//super();
		this.name = name;
	}
	
	public void run() {
		for (int i = 1; i < 10; i++) {
			
			System.out.println(name + "=" + i);
			
		}
	}
	
	

}
