package oopsday1.setget;

public class Carfactory {

	public static void main(String[] args) {
		 Car jag =new Car();
		 jag.setBrand("lame");
		 jag.setColor("red");
		 jag.setPrice(500000);
		 jag.setModel("suv");
		// TODO Auto-generated method stub
		/*
		 * jag.color="Blue"; jag.brand="Audi"; jag.model="Audi A3";
		 * jag.price= 4500000; System.out.println(jag.color);
		 * System.out.println(jag.brand); System.out.println(jag.model);
		 * System.out.println(jag.price);
		 */
		 System.out.println(jag.getBrand());
		 System.out.println(jag.getColor());
		 System.out.println(jag.getPrice());
		 		
		 System.out.println(jag.getModel());
      Car bmw=new Car();
    /*  bmw.brand="BMW";
     bmw.color="white";
      bmw.price=5000000;
      bmw.model="Luxury SUV";
      System.out.println("bmw.brand");
      System.out.println("bmw.color");
      System.out.println("bmw.price");
      System.out.println("bmw.model");
*/	}


}
