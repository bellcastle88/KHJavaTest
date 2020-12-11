package com.kh.test.loop;

import java.util.Scanner;

public class WaterTax {
	public static void main(String[] args) {
		WaterTax wt = new WaterTax();
		wt.wtax();
	}

	public void wtax() {
		Scanner sc = new Scanner(System.in);
		System.out.println("       ----------menu----------\r\n" + "        1. 가정용 (50원/liter)\r\n"
				+ "        2. 상업용 (45원/liter)\r\n" + "        3. 공업용 (30원/liter)\r\n"
				+ "        -------------------------\r\n" + "        메뉴번호를 선택하세요. ==> 2\r\n"
				+ "        물 사용량을 입력하세요. ==> 250");

		System.out.println("\n메뉴번호를 선택하세요. ==>");
		int menu = sc.nextInt();
		System.out.println("물 사용량을 입력하세요. ==>");
		int usage = sc.nextInt();

		int liter = 0;
		String place = "";

		switch (menu) {
		case 1:
			place = "1.가정용";
			liter = 50;
			break;
		case 2:
			place = "2.상업용";
			liter = 45;
			break;
		case 3:
			place = "3.공업용";
			liter = 30;
			break;
		default:
			System.out.println("메뉴번호는 1,2,3만 가능합니다.");
			return;
		}

		int tax = (int) (usage * 0.05);
		int total = usage + tax;

		System.out.println(tax);
		System.out.println("        ----------<<수도세>>-----------\r\n" + "        선택메뉴번호 :" + place
				+ "을(를) 선택하셨습니다. \r\n" + "        사용요금 :" + usage + "\r\n" + "        수도세 : " + tax + "\r\n"
				+ "        총수도요금 : " + total + "");
	}

}
