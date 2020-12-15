package com.kh.test.nested.loop.Test1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Test2 n = new Test2();
		n.test2();
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		if (num < 1)
			System.out.println("양수가 아닙니다");

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < (num - i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
