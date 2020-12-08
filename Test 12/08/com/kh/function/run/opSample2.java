package com.kh.function.run;
import java.util.Scanner;

public class opSample2 {
	
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		
		System.out.print("학생이름 : ");
		String name = info.next();
		
		System.out.print("학년 : ");
		int year = info.nextInt();
		
		System.out.print("반 : ");
		int room = info.nextInt();
		
		System.out.print("번호 : ");
		int num = info.nextInt();
		
		System.out.print("성별 (M/W): ");
		String maleORfemale = info.next();
		
		System.out.print("성적 : ");
		Double grade = info.nextDouble();
		
		System.out.println(" 학생이름 : " + name);
		System.out.println(" 학번 : " + year);
		System.out.println(" 반 : " + room);
		System.out.println(" 번호 : " + num);
		System.out.println("성별 : " + maleORfemale );
		System.out.println("성적 : " + grade );
			
	}
}
