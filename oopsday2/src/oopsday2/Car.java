package oopsday2;

import java.util.Iterator;

public class Car implements CarIface {
	private double fuel;
	private double battery;
	private double kilometers;
	private boolean enginestatus;
	
	public Car() {
		
		// TODO Auto-generated constructor stub
	}
		
	
	public Car(double fuel, double battery, double kilometers, boolean enginestatus) {
		super();
		this.fuel = fuel;
		this.battery = battery;
		this.kilometers = kilometers;
		this.enginestatus = enginestatus;
	}


	@Override
	public void start() {
		// TODO Auto-generated method stub
       if (enginestatus== false && fuel>1000 && battery > 100 ) {
    	   System.out.println("engine starting");
		
	}
	}

	@Override
	public void honk() {
		System.out.println("pam pam pam paaaaaaam.........");
		// TODO Auto-generated method stub

	}

	@Override
	public void move() {if (enginestatus) {
		for (int i=0;i<50;i++);{
			System.out.println("car is moving");
			fuel = fuel-10;
			battery = battery - 2;
			kilometers++;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
		
		// TODO Auto-generated method stub

	}

	@Override
	public void changegear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		System.out.println("car is stopped");
		// TODO Auto-generated method stub

	}


	@Override
	public String toString() {
		return "Car [fuel=" + fuel + ", battery=" + battery + ", kilometers=" + kilometers + ", enginestatus="
				+ enginestatus + "]";
	}

}


