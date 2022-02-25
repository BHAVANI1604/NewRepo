package gym12;

import java.util.Arrays;

public class UseGym {

	public static void main(String[] args) {
		GymEqp g=new GymEqp("threadmile", "lifting");
		GymEqp g1=new GymEqp("rolling", "roll");
		GymEqp g2=new GymEqp("Skipping", "skip");
		GymEqp g3=new GymEqp("layout", "laying");
		GymEqp gym[]={g,g1,g2,g3};
		
		Gym a=new Gym("dumbles", 12.3f, "1 hr", "male", gym);
		Gym a1=new Gym("tights", 2.3f, "2 hrs", "male", gym);
		Gym a2=new Gym("dumbles1", 10.2f, "3 hrs", "male", gym);
		Gym a3=new Gym("shoulder", 2.67f, "4 hrs", "female", gym);
		Gym gym1[]= {a,a1,a2,a3};
		System.out.println(Arrays.toString(gym1));
//		float count=0;
//		for(int i=0;i<gym1.length;i++) {
//			if(gym1[i].getWeight()<12.3)
//			count=count+1;
//			
//		}
		float b=0;
		float c=0;
		for(int i=0;i<gym1.length;i++){
		b =gym1[i].weight%3;
		c=b+c;
		
		}
		System.out.println(c);
		
		
	}

}
