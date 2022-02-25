package aggri;

import java.util.Arrays;

public class phone {
	private String name;
	private int price;
	Battery[] battery;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public phone(String name, int price, Battery[] battery) {
		super();
		this.name = name;
		this.price = price;
		this.battery = battery;
	}
	public Battery[] getBattery() {
		return battery;
	}
	public void setBattery(Battery[] battery) {
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "phone [name=" + name + ", price=" + price + ", battery=" + Arrays.toString(battery) + "]";
	}
 
}
