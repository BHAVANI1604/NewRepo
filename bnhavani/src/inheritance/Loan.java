package inheritance;

public class Loan extends Bank1{
	
	
	String name;
	int bal;
	boolean atm;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	public boolean isAtm() {
		return atm;
	}
	public void setAtm(boolean atm) {
		this.atm = atm;
	}
	public Loan(String name, int bal, boolean atm) {
		super();
		this.name = name;
		this.bal = bal;
		this.atm = atm;
	}
	@Override
	public String toString() {
		return "Loan [name=" + name + ", bal=" + bal + ", atm=" + atm + "]";
	}
	
	String fixedDeposite(String a,String b) {
		return a+b;
	}

}
