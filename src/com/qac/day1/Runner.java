package com.qac.day1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Runner {

	public static void main(String args[]) {

		// this is a single line comment
		/*
		 * this is a multi-line comment
		 */
		
		// instance of class calc
		calc C = new calc();
//		System.out.println(C.addCalc(20, 30));
//		System.out.println(C.subCalc(20, 30));
//		System.out.println(C.multiCalc(20, 30));
//		System.out.println(C.diviCalc(20, 30));
//		System.out.println(C.comboCalc(20, 30, 7));
		
		Iteration I = new Iteration();
		//System.out.println(I.interateAdd(1));
		
		
		ChkString Gstr = new ChkString();
		//System.out.println(Gstr.givenString("hello ", "hello"));
		
		ArrayList<String> numbersinwords = new ArrayList<String>();
		numbersinwords.add("One");
		numbersinwords.add("Two");
		numbersinwords.add("Three");
		numbersinwords.add("Four");
		numbersinwords.add("Five");
		numbersinwords.add("Six");
		numbersinwords.add("Seven");
		numbersinwords.add("Eight");
		numbersinwords.add("Nine");
		numbersinwords.add("Ten");
		
		
		LinkedList<Integer> nums = new LinkedList<Integer>();
		nums.add(1,2);
		
		System.out.println(nums);
		
		
//		for (int i=0; i<=100;i++) {
//			System.out.println("The value counts to "+ i);
//		}
		
//		for (int j=100; j<=999;j++) {
//			System.out.println("The value counts to "+ j);
//		}
		
		for (int i=0; i<=10;i++) {
			System.out.println(numbersinwords.get(1 +i));
		}
		

		

		//System.out.println(numbersinwords.get(0));
		
//		CheckString cs = new CheckString();
//		System.out.println(cs.checkMatch("Hello"));
		
		
		
//		Boolean bool = true;
//		String homeAdd = "1234 Example Road, London, M50 3SA";
//		int height = 176;
//		int age = 23; // data type being int, variable named age has a value of 23
//		System.out.println("Hello World");
//
//		System.out.println("I am " + age); // + means append variable
//
//		System.out.println("I am " + height + "cm");
//
//		System.out.println("My address is " + homeAdd);
//
//		System.out.println("The value of the set boolean is " + bool);
//
//		System.out.println("My height is " + height + " my address is " + homeAdd + " value of bool is " + bool);
//		
//		
//		
	}

}
