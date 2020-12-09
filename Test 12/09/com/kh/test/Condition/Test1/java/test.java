package com.kh.test.Condition.Test1.java;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		test ct = new test();
		ct.test1();
		ct.test2();
		ct.test3();
	}

	public void test1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 : ");
		int kor = scan.nextInt();

		System.out.println("영어 : ");
		int eng = scan.nextInt();

		System.out.println("수학 : ");
		int math = scan.nextInt();

		int total = kor + eng + math;

		if (total >= 250) {
			System.out.println("우수생입니다.");
		} else {
			System.out.println("우수생이 아닙니다.");
		}
	}

	public void test2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("A 연봉 : ");
		int SalaryA = scan.nextInt();

		System.out.println("B 연봉 : ");
		int SalaryB = scan.nextInt();

		System.out.println("C 연봉 : ");
		int SalaryC = scan.nextInt();

		int total = SalaryA + SalaryB + SalaryC;

		if (SalaryA >= 5000) {
			System.out.println("A는 고액연봉자입니다");
		} else if (SalaryB >= 5000) {
			System.out.println("B는 고액연봉자입니다");
		} else if (SalaryC >= 5000) {
			System.out.println("C는 고액연봉자입니다");
		} else {
			System.out.println("error");
		}
	}

	public void test3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 : ");
		char i = scan.next().charAt(0);

		if (i % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}
}
