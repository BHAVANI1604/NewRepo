package aggri;

public class UseMobile {

	public static void main(String[] args) {
		
  Battery b=new Battery(10, "sony", "abc");
  Battery b1=new Battery(11, "sony132", "def");
  Battery b2=new Battery(12, "lc", "xyz");
  Battery[]x= {b,b1,b2};
  phone p=new phone("samsung", 1000, x);
  phone p1=new phone("samsung", 1000, x);
  System.out.println(p);
  System.out.println(p1);
	}

}
