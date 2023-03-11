package Multithreading;



public class TestThreads {

	public static void main(String[] args) {
		
		System.out.println("main started...");
		
		MyThreads t1 = new MyThreads("T1");
		MyThreads t2 = new MyThreads("T2"); //run() is the entry point for child threads // the code in main is executed by main and code in child thraeds are run by run()
		
		t1.start();
		t2.start();
		
		System.out.println("main exited");
		

	}

}
