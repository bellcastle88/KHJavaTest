package com.kh.test.nested.loop.Test1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 n = new Test1();
		n.test1();
	}

	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력 : ");
		int num = sc.nextInt();

		if (num < 1)
			System.out.println("양수가 아닙니다");

		for (int i = 0; i < (num + 1); i++) {
			for (int j = 1; j < (i + 1); j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
