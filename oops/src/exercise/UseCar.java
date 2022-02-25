package exercise;

public class UseCar {

	public static void main(String[] args) {
		Engine e=new Engine(1200, "ganga","abc");
		Car c=new Car("nano", 1200,e);
		System.out.println(c);

	}

}
