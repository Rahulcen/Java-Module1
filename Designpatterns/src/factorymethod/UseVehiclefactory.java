package factorymethod;

public class UseVehiclefactory {
	public static void main(String[] args) {
		
		
		Vehicle creta =  Vehiclefactory.newInstance("Creta");
		creta.start();
		Vehicle seltos=Vehiclefactory.newInstance("Seltos");
		seltos.honk();
		Vehicle suzuki=Vehiclefactory.newInstance("Xcross");
		suzuki.moove();
	}

}
