package inheritance;

public class Bank1 extends Bank{
	int normalDeposite(int a,int b) {
		return a+b;
	}
	int normalDeposite(int a,int b, int c) {
		
		return a+b+c;
	}
	String fixedDeposite(String a,String b) {
		return a+b;
	}

}
