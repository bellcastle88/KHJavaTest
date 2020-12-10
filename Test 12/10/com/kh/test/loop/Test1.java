package com.kh.test.loop;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.test1();
	}

	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println(i % 2 == 0 ? i + " " : " ");
		}
	}
}
