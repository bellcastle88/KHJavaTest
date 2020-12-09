package com.kh.test.random.RandomTest.test;

import java.util.Scanner;

public class Rps {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자선택: 1(가위), 2(바위), 3(보)");
		int rps = scan.nextInt();

		System.out.println("====결과====");
		if (rps == 1) {
			System.out.println("가위");
			System.out.println("컴퓨터는 보를 냈습니다");
			System.out.println("당신이 이겼습니다");
		} else if (rps == 2) {
			System.out.println("바위");
			System.out.println("컴퓨터는 보를 냈습니다");
			System.out.println("당신이 졌습니다");
		} else if (rps == 3)  {
			System.out.println("보");
			System.out.println("컴퓨터는 보를 냈습니다");
			System.out.println("비겼습니다");
		} else {
			System.out.println("error");
		}
		System.out.println("==========");
	}

}
