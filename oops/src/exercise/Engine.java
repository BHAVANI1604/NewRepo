package exercise;

public class Engine {
	int price;
	String name;
	String brand;
	@Override
	public String toString() {
		return "Engine [price=" + price + ", name=" + name + ", brand=" + brand + "]";
	}
	public Engine(int price, String name, String brand) {
		super();
		this.price = price;
		this.name = name;
		this.brand = brand;
	}
}
