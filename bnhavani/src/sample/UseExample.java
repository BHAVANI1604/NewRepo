package sample;

public class UseExample {

	public static void main(String[] args) {
		Example e=new Example();
		Example e1=new Example();
		Example e2=new Example();
		e.brand="Skybags";
		e.logo="sample";
		e.price=5000;
		e.istravelbag=true;
		e1.brand="Skybagssss";
		e1.logo="sample11";
		e1.price=67000;
		e1.istravelbag=false;
		e2.brand="American";
		e2.logo="flight";
		e2.price=123000;
		e2.istravelbag=true;
		Example arr[]=new Example[3];
		arr[0]=e;
		arr[1]=e1;
		arr[2]=e2;
		int max = 0;
		int min =arr[0].price;
		//for(int i=0;i<2;i++)
		boolean isEqual=true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].istravelbag==true) {
				System.out.println(arr[i].brand);
			}
			else {
				System.out.println(arr[i].brand);
			}
//			if(arr[i].brand=="American") {
//				if(arr[i].brand=="American") {
//					isEqual=false;
//				}
//			}
//			if(isEqual==false) {
//				System.out.println("equal");
//			}
//			else {
//				System.out.println("not equal");
//			}
//			if(arr[i].logo=="flight") {
//				System.out.println("equal");
//			}else {
//				
//				System.out.println("not equal");
//			}
//			
//			if(arr[i].price>max) {
//				max=arr[i].price;
//				
//				
//			}
//			if(arr[i].price<min) {
//				min=arr[i].price;
//			}
			
			
			
		}
		//System.out.println(max);
		//System.out.println(min);
		
		
		}
		

	}
	


