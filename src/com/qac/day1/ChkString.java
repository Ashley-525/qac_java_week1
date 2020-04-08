package com.qac.day1;

public class ChkString {
	
	public String givenString(String a, String b) {
		
		String c = a+b;
		if (a == b) {
//			boolean b1=Boolean.parseBoolean(c);
//			System.out.println(b1);
			return c;
		}
		return a;
		
	}
	
	public boolean checkMatch(String str) {
		boolean bool;
		String str2 = "Hi";
		if(str == str2) {
			bool=true;
		} bool= false;
		
		return bool;
		
	}
	

}
