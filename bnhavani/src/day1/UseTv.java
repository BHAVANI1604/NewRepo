package day1;

public class UseTv {

	public static void main(String[] args) {
	Tv t=new Tv();
	Tv t1=new Tv();
	Tv t2=new Tv();
	Tv t3=new Tv();
	t.brand="sony";
	t.model="s1";
	t.price=10000;
	
	t1.brand="Samsung";
	t1.model="s234";
	t1.price=50000;
	
	t2.brand="mac";
	t2.model="m12";
	t2.price=5000;
	
	t3.brand="lg";
	t3.model="l1";
	t3.price=20000;
	Tv []tv= {t,t1,t2,t3};
	int min=10000;
	for(int i=0;i<tv.length;i++) {
		if(tv[i].price<min) {
			System.out.println(tv[i].price);
		}
	}
	

	}

}
