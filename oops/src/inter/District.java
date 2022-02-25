package inter;

public class District extends TamilNadu {
	
	
	public static void main(String[] args) {
		
		District c=new District();
		System.out.println(c.districtNumber(7));
		System.out.println(c.noPlateColor("white"));
		System.out.println(c.noPlateDesignPattern("Double line"));
		System.out.println(c.stateCode("TN"));
		

		
	}

	@Override
	public String stateCode(String a) {
		if(a.equalsIgnoreCase("TN")) {
			return "This is TamilNadu vehicle";
		}
		else {
		return "Pleace check the state";
		}
	}

	@Override
	public String districtNumber(int a) {
		if(a==1||a==2||a==3||a==4||a==5||a==6||a==7||a==8||a==9||a==10||a==11) {
			return "This is Chennai Registration";
		} else {
		return "Not chennai Registration";
		}
	}

}
