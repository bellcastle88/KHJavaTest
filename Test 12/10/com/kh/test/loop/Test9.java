package com.kh.test.loop;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		Test9 t9 = new Test9();
		t9.test();
	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*********주메뉴*********\r\n" + "       a. 불고기버거 ------------5000\r\n"
				+ "       b. 새우버거 --------------4000\r\n" + "       c. 치킨버거 --------------4500\r\n"
				+ "       d. 한우버거 -------------10000\r\n" + "       e. 디버거 ----------------7000\r\n"
				+ "       ***********************	\r\n" + "       \r\n" + "       *******사이드메뉴********\r\n"
				+ "		1. 콜라 -------------------1500\r\n" + "		2. 사이다 -----------------1500\r\n"
				+ "		3. 밀크쉐이크-------------2500\r\n" + "		4. 레드불------------------3000\r\n"
				+ "		***********************");

		System.out.println("주메뉴 : ");
		String main = sc.nextLine();
		System.out.println("사이드메뉴 : ");
		int side = sc.nextInt();

		int mainPrice = 0;
		String mainMenu = "";

		switch (main) {
		case "a":
			mainPrice = 5000;
			mainMenu = "불고기버거";
			break;
		case "b":
			mainPrice = 4000;
			mainMenu = "새우버거";
			break;
		case "c":
			mainPrice = 4500;
			mainMenu = "치킨버거";
			break;
		case "d":
			mainPrice = 10000;
			mainMenu = "한우버거";
			break;
		case "e":
			mainPrice = 7000;
			mainMenu = "디버거";
			break;
		default:
			System.out.println("번호가 잘못 입력되었습니다. 영업을 종료합니다.");
		}

		int sidePrice = 0;
		String sideMenu = "";

		switch (side) {
		case 1:
			sidePrice = 1500;
			sideMenu = "콜라";
			break;
		case 2:
			sidePrice = 1500;
			sideMenu = "사이다";
			break;
		case 3:
			sidePrice = 2500;
			sideMenu = "밀크쉐이크";
			break;
		case 4:
			sidePrice = 3000;
			sideMenu = "레드불";
			break;
		default:
			System.out.println("번호가 잘못 입력되었습니다. 영업을 종료합니다.");
		}

		System.out.println(mainMenu + ", " + sideMenu + " 총 " + (mainPrice + sidePrice) + "원 입니다.");
	}

}
