package com.kh.test.Condition.Test5.java;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		test t5 = new test();
		t5.test();

	}

	public void test() {

		Scanner sc = new Scanner(System.in);

		System.out.println("키(cm)를 입력하세요. (ex. 175) : ");
		int height = sc.nextInt();
		System.out.println("몸무게(kg)를 입력하세요. (ex. 65) : ");
		double weight = sc.nextInt();

		double bmi = weight / (((double) height / 100.0) * ((double) height / 100.0));
		System.out.println("BMI = " + bmi);

		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi >= 18.5 && bmi < 23.0) {
			System.out.println("정상체중");

		} else if (bmi >= 23.0 && bmi < 25.0) {
			System.out.println("과체중");

		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("비만");

		}

		else if (bmi >= 30.0) {
			System.out.println("고도비만");

		}

		sc.close();
	}

}