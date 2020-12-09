package com.kh.test.Condition.Test3.java;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		test3 t3 = new test3();
		t3.test1();
	}

	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력: ");
		int num1 = sc.nextInt();

		System.out.println("연산자 입력: ");
		int oper = sc.nextInt();

		System.out.println("숫자 입력: ");
		int num2 = sc.nextInt();

		int sum = num1 +  + num2;

		if(oper == '+') {
			System.out.println(num1 +"+" +num2 +"="+(num1+num2));
		}
		else if(oper =='-'){
			System.out.println(num1 +"-" +num2 +"="+(num1-num2));
		}
		else if(oper =='*'){
			System.out.println(num1 +"*" +num2 +"="+(num1*num2));
		}
		else if(oper =='/'){
			System.out.println(num1 +"/" +num2 +"="+(num1/num2));
		}
		else {
			System.out.println("잘못 입력 하셨습니다.프로그램을 종료합니다.");
		}

	}

}
