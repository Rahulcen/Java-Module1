package oopsday1;

public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Car jag =new Car();
      jag.color="Blue";
      jag.brand="Audi";
      jag.model="Audi A3";
      jag.price= 4500000;
      System.out.println(jag.color);
      System.out.println(jag.brand);
      System.out.println(jag.model);
      System.out.println(jag.price);
      
      Car bmw=new Car();
      bmw.brand="BMW";
      bmw.color="white";
      bmw.price=5000000;
      bmw.model="Luxury SUV";
      System.out.println("bmw.brand");
      System.out.println("bmw.color");
      System.out.println("bmw.price");
      System.out.println("bmw.model");
	}

	
}
