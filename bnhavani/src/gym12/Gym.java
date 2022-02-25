package gym12;

import java.util.Arrays;

public class Gym {
	private String name;
	float weight;
	private String workinghrsInGym;
	private String gender;
	private GymEqp gymEqp[];
	@Override
	public String toString() {
		return "Gym [name=" + name + ", weight=" + weight + ", workinghrsInGym=" + workinghrsInGym + ", gender="
				+ gender + ", gymEqp=" + Arrays.toString(gymEqp) + "]";
	}
	public Gym(String name, float weight, String workinghrsInGym, String gender, GymEqp[] gymEqp) {
		super();
		this.name = name;
		this.weight = weight;
		this.workinghrsInGym = workinghrsInGym;
		this.gender = gender;
		this.gymEqp = gymEqp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getWorkinghrsInGym() {
		return workinghrsInGym;
	}
	public void setWorkinghrsInGym(String workinghrsInGym) {
		this.workinghrsInGym = workinghrsInGym;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public GymEqp[] getGymEqp() {
		return gymEqp;
	}
	public void setGymEqp(GymEqp[] gymEqp) {
		this.gymEqp = gymEqp;
	}
	

}
