package serial;

import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		
ArrayList<String>a=new ArrayList<>();
a.add("ganga");
a.add("Satya");
a.add("bhavani");
a.add("devi");
a.add("kkd");
System.out.println(a);
ArrayList<String>a1=new ArrayList<String>(a.subList(2, 5));
System.out.println(a1);
	}

}
