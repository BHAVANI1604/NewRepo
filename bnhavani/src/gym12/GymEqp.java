package gym12;

public class GymEqp {
	String eqpName;
	String eqpUsage;
	public GymEqp(String eqpName, String eqpUsage) {
		super();
		this.eqpName = eqpName;
		this.eqpUsage = eqpUsage;
	}
	@Override
	public String toString() {
		return "GymEqp [eqpName=" + eqpName + ", eqpUsage=" + eqpUsage + "]";
	}
	

}
