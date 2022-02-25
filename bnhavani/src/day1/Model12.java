package day1;

import java.util.Arrays;

public class Model12 {

	public static void main(String[] args) {
		Model m=new Model("oppo", 1000);
		Model m1=new Model("vivo", 3000);
		Model m2=new Model("samsung", 4000);
		Model m3=new Model("lava", 7000);
		
		Model []model= {m,m1,m2,m3};
		
		Phone p=new Phone ("Bhavani", 1, model);
		Phone p1=new Phone ("satya", 2, model);
		Phone p2=new Phone ("ganga", 3, model);
		Phone p3=new Phone ("BhavaniAnusuri", 4, model);
		
		Phone []phone= {p,p1,p2,p3};
		System.out.println(Arrays.toString(phone));
		

	}

}
