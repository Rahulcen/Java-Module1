package oopsday1.setget;

public class Car {
	private String color;
    private	double price;
	private String brand;
	private String model;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
	 this.brand = brand;
	}
	public String getModel() {
		return this. model;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + ", brand=" + brand + ", model=" + model + ", getColor()="
				+ getColor() + ", getPrice()=" + getPrice() + ", getBrand()=" + getBrand() + ", getModel()="
				+ getModel() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public void setModel(String model) {
		this.model = model;
	}
    
}
