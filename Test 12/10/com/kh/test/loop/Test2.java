package com.kh.test.loop;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Test2 t1 = new Test2();
		t1.test1();
	}

	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println("박");
			} else {
				System.out.println("수");
			}
		}
	}
}