package com.oop.emp.model;

import java.util.Scanner;

public class EmpTest {

	public static void main(String[] args) {

		Employee em = new Employee();
		Scanner sc = new Scanner(System.in);
		boolean re = true;

		while (re) {

			System.out.println("******* 사원 정보 관리 프로그램 ************");
			System.out.println("1. 새 사원 정보 입력  => ");
			System.out.println("2. 사원 정보 삭제 => ");
			System.out.println("3. 사원정보 출력 => ");
			System.out.println("9. 끝내기");
			System.out.print(">>>>>>");

			int key = sc.nextInt();

			switch (key) {
			case 1:
				em.empInput();
				break;

			case 2:
				em = null;
				break;

			case 3:
				em.empOutput();
				System.out.println(" ");
				break;
			case 9:
				System.out.println("프로그램 종료");
				re = false;
				break;

			default:
				System.out.println("다시 입력하세요");
			}
		}
	}
}
