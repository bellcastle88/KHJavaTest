package com.kh.test.Condition.Test4.java;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		test t4 = new test();
		t4.test1();
	}

	public void test1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		char i = scan.next().charAt(0);

		if (i % 2 == 0) {
			System.out.println("짝수");
		} else if (i % 2 == 0) {
			System.out.println("홀수");
		} else if (i > 10) {
			System.out.println("반드시 1~10사이의 정수를 입력해야 합니다");
		}

	}
}
