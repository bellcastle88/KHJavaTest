package com.kh.test;

public class Test2 {

	public static void main(String[] args) {
		 
		System.out.println("A = "+ ('A'+0));
        // (65 + 0) 
        System.out.println("0 =" + ('0' + 0) );
        // (48 + 0)
        System.out.println("(char)65 = " + (char)65);
        // (char)65 = A
        
        byte bt1 = 125;
        char ch1 = 'C';
        int it1 = bt1 - ch1;
        System.out.println("it1 = "+it1);
        // 125 - 67 = 58
        //char은 숫자랑 붙으면 숫자가 됌
        
        boolean bool = false;
            
        bool = (2.0 == 5/2);
        System.out.println("bool = " + bool);
        // false = false 
        // True
        
        bool = ('C' == 67);
        System.out.println("bool = " + bool);
        // C(67) == 67 
        // True
        
        bool = ('A' == 'B'-1);
        System.out.println("bool = " + bool);
        // A(65) == ( B(66) - 1 )
        // True
        
        bool = ('a' != 97 );//부정연산자
        System.out.println("bool = " + bool);
        // a(97) != 97 
        // False

	}

}
