package sample;

import java.util.Arrays;

public class Car extends OldCar {
	private int id;
	private String brand;
	private String model;
	private Enginee e;
	private Race[] race;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Enginee getE() {
		return e;
	}
	public void setE(Enginee e) {
		this.e = e;
	}
	public Race[] getRace() {
		return race;
	}
	public void setRace(Race[] race) {
		this.race = race;
	}
	public Car(int id, String brand, String model, Enginee e, Race[] race) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.e = e;
		this.race = race;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", model=" + model + ", e=" + e + ", race="
				+ Arrays.toString(race) + "]";
	}
	
	String mileage(String a) {
		return a;
	}

}
