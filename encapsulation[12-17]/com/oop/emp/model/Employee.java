package com.oop.emp.model;

import java.util.Scanner;

public class Employee {
	private int empno;
	private String empname;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonuspoint;
	private String phone;
	private String address;

	// setter
	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setBonuspoint(double bonuspoint) {
		this.bonuspoint = bonuspoint;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// getter
	public int getEmpno() {
		return empno;
	}

	public String getEmpname() {
		return empname;
	}

	public String getDept() {
		return dept;
	}

	public String getJob() {
		return job;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public int getSalary() {
		return salary;
	}

	public double getBonuspoint() {
		return bonuspoint;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	// empInput
	public void empInput() {
		Scanner sc = new Scanner(System.in);

		System.out.print("사번 :  ");
		setEmpno(sc.nextInt());

		System.out.print("이름 :  ");
		setEmpname(sc.next());

		System.out.print("소속부서 :  ");
		setDept(sc.next());

		System.out.print("직급 :  ");
		setJob(sc.next());

		System.out.print("나이 :  ");
		setAge(sc.nextInt());

		System.out.print("성별 :  ");
		setGender(sc.next().charAt(0));

		System.out.print("급여 :  ");
		setSalary(sc.nextInt());

		System.out.print("보너스포인트 :  ");
		setBonuspoint(sc.nextDouble());

		System.out.print("핸드폰 :  ");
		setPhone(sc.next());

		System.out.print("주소 :  ");
		setAddress(sc.next());

	}

	public void empOutput() {
		System.out.print("사번 : " + getEmpno() + "\n" + "이름 : " + getEmpname() + "\n" + "소속부서 : " + getDept() + "\n"
				+ "직급 : " + getJob() + "\n" + "나이 : " + getAge() + "\n" + "성별 : " + getGender() + "\n" + "급여 : "
				+ getSalary() + "\n" + "보너스포인트 : " + getBonuspoint() + "\n" + "핸드폰 : " + getPhone() + "\n" + "주소 : "
				+ getAddress());
	}

}
