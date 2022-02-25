package inheritance;

public class UseBank  {
	public static void main(String[] args) {
	
	Loan l1=new Loan("bhavani", 10000, false);
	Loan l2=new Loan("satya", 20000, true);
	Loan l3=new Loan("anu", 30000, false);
	Loan l4=new Loan("hello",450000, true);
	
	Loan []loan= {l1,l2,l3,l4};
	for(int i=0;i<loan.length;i++) {
		System.out.println(loan[i]);
	}
	System.out.println(l1.fixedDeposite("bhavani", "anusuri"));
	System.out.println(l1.normalDeposite(10, 4000));
	System.out.println(l1.normalDeposite(10000, 30000, 40000));
	l1.deails();
l2.account();
l3.bankBook();
 

}}
