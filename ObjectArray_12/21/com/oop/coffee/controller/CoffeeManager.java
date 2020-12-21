package com.oop.coffee.controller;

import java.util.Scanner;

import com.oop.coffee.model.dto.Coffee;

public class CoffeeManager {
	Coffee[] coffee = new Coffee[3];
	Scanner sc = new Scanner(System.in);

	public CoffeeManager() {

		String info1, info2;

		for (int i = 0; i < coffee.length; i++) {
			System.out.println("원산지 : ");
			info1 = sc.nextLine();

			System.out.println("지역 : ");
			info2 = sc.nextLine();

			coffee[i] = new Coffee(info1, info2);
		}

		System.out.println("<세계 3대 커피>");
		System.out.println("-----------------");
		System.out.println("원산지          지역");
		for (int i = 0; i < coffee.length; i++) {
			coffee[i].print();
		}
	}
}
