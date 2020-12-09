package com.kh.test.Condition.Test2.java;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Test ct = new Test();
		ct.test1();
	}

	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 : ");
		int kor = sc.nextInt();

		System.out.println("영어 : ");
		int eng = sc.nextInt();

		System.out.println("수학 : ");
		int math = sc.nextInt();

		int sum = kor + eng + math;
		double av = sum / 3;

		if (av >= 60 && kor >= 40 && eng >= 40 && math >= 40) {
			System.out.println("평균 : " + av + " 합격입니다");
		} else {
			System.out.println("불합격");
		}

	}
}
