package bnhavani123;

public class Sample1 {
	public enum Month{ MARCH,APRIL,MAY,JUN,JULY,AUGEST}

	public static void main(String[] args) {
		Month m=Month.APRIL;
		System.out.println(m);
		for(Month e:Month.values()) {
			System.out.println(e);
		}
		System.out.println(Month.valueOf("MARCH"));
		System.out.println(Month.valueOf("MARCH").ordinal());
		System.out.println(Month.valueOf("JULY").ordinal());

	}

}
 