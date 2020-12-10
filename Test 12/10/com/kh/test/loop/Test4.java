package com.kh.test.loop;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 :  ");
		String str = sc.nextLine();

		System.out.println("검색할 문자 : ");
		char srh = sc.next().charAt(0);
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == srh) {
				count++;
			}
		}
		System.out.println("문자갯수 : " + count);

	}

}
