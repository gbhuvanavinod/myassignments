package org.student;

import org.department.Department;

public class Student extends Department {


	public void studentName() {
		System.out.println("Student name is xyz");
	}
	public void studentDept() {
		System.out.println("student dept is IT");
	}
	public void studentID() {
		System.out.println("student id is ID01");
	}
	public int getStudentInfo(int id) {
		return id;
	}
	public char getStudentInfo(int id,char name) {
		return name;
		
	}
	public long getStudentInfo(char e,long phno) {
		return phno;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student();
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		st.deptName();
		st.studentDept();
		st.studentID();
		st.studentName();
		//overloading methods
		int studentId = st.getStudentInfo(1001);
		System.out.println("student id "+studentId);
		char stname = st.getStudentInfo(1001,'s');
		System.out.println("student name is "+stname);
		long stphno = st.getStudentInfo('e',999999999);
		System.out.println("student phno is "+stphno);
		
	}

}
