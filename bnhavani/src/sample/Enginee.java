package sample;

public class Enginee {
	int id;
	String brand;
	String model;
	String fuelType;
	public Enginee(int id, String brand, String model, String fuelType) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.fuelType = fuelType;
	}
	@Override
	public String toString() {
		return "Enginee [id=" + id + ", brand=" + brand + ", model=" + model + ", fuelType=" + fuelType + "]";
	}
	
	

}
