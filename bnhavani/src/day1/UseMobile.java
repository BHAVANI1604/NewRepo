package day1;

public class UseMobile {
	public static void main(String[] args) {
		 Mobile  m=new  Mobile ();
		 m.company="vivo";
		 m.model="v11";
		 m.price=10000;
		 Mobile m1=new  Mobile ();
		 m1.company="oppo";
		 m1.model="oppo12";
		 m1.price=9000;
		 Mobile m2=new  Mobile ();
		 m2.company="mi";
		 m2.model="m11";
		 m2.price=7000;
		 System.out.println(m.company+" ," +m.model+" ,"+m.price);
		 System.out.println(m1.company+" ," +m1.model+" ,"+m1.price);
		 System.out.println(m2.company+" ," +m2.model+" ,"+m2.price);
		
//		 int totalPrice = m.price+m1.price+m2.price;
//		 System.out.println(totalPrice/3);
//		 System.out.println(totalPrice*3/100);
//		 
		 Mobile []mobile= {m,m1,m2};
		 for(int i=0;i<mobile.length;i++) {
			 //System.out.println(mobile[i].company);
			 if(mobile[i].price>5000&&mobile[i].price<5000) {
				int b=mobile[i].price*4/100;
				//System.out.println(b);
				int c=mobile[i].price-b;
				System.out.println(c);
			 }
		 }
		
	}

}
