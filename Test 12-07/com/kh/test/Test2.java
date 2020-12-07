package com.kh.test;

public class Test2 {

	public static void main(String[] args) {
		 
		System.out.println("A = "+ ('A'+0));
         
        System.out.println("0 =" + ('0' + 0) );
        
        System.out.println("(char)65 = " + (char)65);
        
        byte bt1 = 125;
        char ch1 = 'C';
        int it1 = bt1 - ch1;
        System.out.println("it1 = "+it1);
        
        
        boolean bool = false;
        
        bool = (2.0 == 5/2);
        System.out.println("bool = " + bool);
        
        bool = ('C' == 67);
        System.out.println("bool = " + bool);
        
        bool = ('A' == 'B'-1);
        System.out.println("bool = " + bool);
        
        bool = ('a' != 97 );//부정연산자
        System.out.println("bool = " + bool);

	}

}
