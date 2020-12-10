package com.kh.test.loop;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 t2 = new Test3();
		t2.test3();
	}

	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 출력 :  ");
		int mult = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(mult + " * " + i + " = " + (mult * i));
		}

	}

}
