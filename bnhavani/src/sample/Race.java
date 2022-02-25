package sample;

public class Race {
	String carModel;
	String company;
	int price;
	int carRaceTime;
	int speed;
	public Race(String carModel, String company, int price, int carRaceTime, int speed) {
		super();
		this.carModel = carModel;
		this.company = company;
		this.price = price;
		this.carRaceTime = carRaceTime;
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Race [carModel=" + carModel + ", company=" + company + ", price=" + price + ", carRaceTime="
				+ carRaceTime + ", speed=" + speed + "]";
	}
	

}
