package exercise;

public class Car {
	private String name;
	private int carCost;
	@Override
	public String toString() {
		return "Car [name=" + name + ", carCost=" + carCost + ", engine=" + engine + "]";
	}
	public Car(String name, int carCost, Engine engine) {
		super();
		this.name = name;
		this.carCost = carCost;
		this.engine = engine;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCarCost() {
		return carCost;
	}
	public void setCarCost(int carCost) {
		this.carCost = carCost;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	private Engine engine;
	

}
