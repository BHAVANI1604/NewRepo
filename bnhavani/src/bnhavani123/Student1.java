package bnhavani123;

import java.util.ArrayList;

public class Student1 {

	public static void main(String[] args) {
		Student s=new Student("bhavani",101,"cse");
		Student s1=new Student("satya",102,"ece");
		Student s2=new Student("anu",103,"mech");
		ArrayList<Student>li=new ArrayList<Student>();
		li.add(s);
		li.add(s1);
		li.add(s2);
		System.out.println(li);

	}

}
