package bnhavani123;

import java.util.HashMap;

public class CollectMap {

	public static void main(String[] args) {
		HashMap<Integer, String>hm=new HashMap<Integer, String>();
		hm.put(1, "Hyd");
		hm.put(2, "chennai");
		for(int i=0;i<hm.size();i++) {
			System.out.println(hm.keySet()+" "+hm.values());
		}

	}

}
