package com.kh.test.loop;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("        **********메  뉴*********\r\n" + "       1. 떡볶이 ----------------1000\r\n"
				+ "       2. 김밥 ------------------ 2000\r\n" + "       3. 오뎅 ------------------ 1000\r\n"
				+ "       4. 순대 ------------------ 2000\r\n" + "       5. 튀김 ------------------ 3000\r\n"
				+ "       6. 떡튀순 ---------------- 8000\r\n" + "	*************************");

		System.out.println("번호입력 : ");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			System.out.println("떡볶이는 1000원입니다.");
			return;
		case 2:
			System.out.println("김밥은 2000원입니다.");
			return;
		case 3:
			System.out.println("오뎅은 1000원입니다.");
			return;
		case 4:
			System.out.println("순대는 2000원입니다.");
			return;
		case 5:
			System.out.println("튀김은 3000원입니다.");
			return;
		case 6:
			System.out.println("떡튀순은 8000원입니다.");
			return;
		default:
			System.out.println("번호가 잘못 입력되었습니다. 영업을 종료합니다.");
		}

	}

}
