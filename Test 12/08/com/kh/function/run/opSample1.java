package com.kh.function.run;

import java.util.Scanner;

public class opSample1 {

	public static void main(String[] args) {
		
		Scanner score = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int Korean = score.nextInt();
		
		System.out.print("영어 : ");
		int English = score.nextInt();
		
		System.out.print("수학 : ");
		int Math = score.nextInt();
		
		int total = Korean + English + Math;
		double Average = total /3.0; 
		
		System.out.println(Korean >= 40 && English >= 40 && Math >= 40 && Average >= 60 ? "합격" : "불합격" );
		System.out.println("합계 : " + total + " 평균 : " + Average);
	}
	
}
