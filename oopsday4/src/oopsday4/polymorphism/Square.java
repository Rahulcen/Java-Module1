package oopsday4.polymorphism;

public class Square extends Shape{
	
private int side;
	
	public Square() {
		// TODO Auto-generated constructor stub
	}

	public Square(int side) {
		super();
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}


}
