package oopsday2;

public class CarFactory {

	public static void main(String[] args) {
		Car car = new Car(5000,500,0,false);
		car.start();
		car.move();
		car. honk();
		car.stop();
		
		// TODO Auto-generated method stub

	}

}
