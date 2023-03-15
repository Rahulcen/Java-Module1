package oopsday4.polymorphism;

public class TestShapes {

	public static void main(String[] args) {
		
		Object s = new Rectangle();
		double result =s.hashCode();
		System.out.println(result);
		
		s = new Circle(65.87);
		result = ((Circle) s).area();
		System.out.println(result);
		
		s = new Square(55);
		result = ((Shape) s).area();
		System.out.println(result);
		// TODO Auto-generated Smethod stub

	}

}


