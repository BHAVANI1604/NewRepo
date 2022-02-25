package bnhavani123;

public class Student {
	String name;
	int id;
	String branch;
	public String getName() {
		return name;
	}
	public Student(String name, int id, String branch) {
		super();
		this.name = name;
		this.id = id;
		this.branch = branch;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
public 	String toString() {
	return name+" "+ id+" "+branch;
}

}
