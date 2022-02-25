package day1;

public class Model {
	String name;
	int price;
	public Model(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Model [name=" + name + ", price=" + price + "]";
	}

}
