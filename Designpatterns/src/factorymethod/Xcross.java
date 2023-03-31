package factorymethod;

public class Xcross implements Vehicle {

	@Override
	public void start() {
		System.out.println("started........"+getClass());
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		System.out.println("stopped......"+getClass());
		
		// TODO Auto-generated method stub

	}

	@Override
	public void honk() {
		System.out.println("pam pam...."+getClass());
		// TODO Auto-generated method stub

	}

	@Override
	public void moove() {
		System.out.println("moving....."+getClass());
		// TODO Auto-generated method stub

	}

}
