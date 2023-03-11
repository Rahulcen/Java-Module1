package oopsday2;

import javax.xml.stream.events.StartDocument;

public class CarFactory2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CarIface car;//not ref to any object..
      CarIface car = new Car(5000,500,0,false);
      car.start();
	}

}
