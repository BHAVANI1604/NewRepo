package sample;

public class UseCareRace {

	public static void main(String[] args) {
		Race r1=new Race("nano", "nano123", 120000, 60, 3);
		Race r2=new Race("bmw", "bmw123", 170000, 300, 1);
		Race r3=new Race("maruthi", "maruthi123", 1240000, 200, 4);
		Race r4=new Race("hero", "hero123", 123450000, 50, 2);
		Race r5=new Race("activa", "Activa123", 9860000, 100, 5);
		Race[] race=new Race[] {r1,r2,r3,r4,r5};
		Enginee e=new Enginee(34567, "highlevel", "hundai", "petrol");
		Car c1=new Car(345678, "Etios", "4+1", e, race);
		Car c2=new Car(3476, "TATA", "6+1", e, race);
		Car c3=new Car(3487, "Hundai", "4+1", e, race);
		Car c4=new Car(98765, "Dzire", "6+1", e, race);
		Car c5=new Car(298764, "Etios", "4+1", e, race);
		Car[] car=new Car[] {c1,c2,c3,c4,c5};
		for(Car s:car) {
			System.out.println(s);
		}
		System.out.println(c1.mileage("upto 25km per litter"));
		System.out.println(c4.speed());
		System.out.println(c3.speed(120));


	}

}
