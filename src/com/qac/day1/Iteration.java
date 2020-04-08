package com.qac.day1;

public class Iteration {
	
	public int interateAdd() {
		
//		IntStream.rangeClosed(1, 10)
//        .forEach(System.out::println);
//		
//		for (int i=0; i<arr.length; i++)
//		{
//			type var = arr[i];
//			statements using var;
//		}
//		
//		int b = ++a;
//		
//		return b;
		
		
		int a = 0;
		boolean ab = true;
		
		while (ab) {
			System.out.println("text here");
			a++;
			
			if (a > 99)
					ab = false;
		}
		return interateAdd();
	}

}
