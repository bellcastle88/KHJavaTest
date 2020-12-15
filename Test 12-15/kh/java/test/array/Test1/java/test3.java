package kh.java.test.array.Test1.java;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		test3 a = new test3();
		a.Test3();
	}

	public void Test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력값 :  ");
		String str = sc.nextLine();

		System.out.println("검색값: ");
		char srh = sc.next().charAt(0);
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == srh) {
				count++;
			}
		}
		System.out.println("입력하신 문자열 " + str + "에서 찾으시는 문자 " + srh + "은 " + count + "개 입니다.");

	}

}
