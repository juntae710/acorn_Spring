package com.acorn.day1.ex;

public class BBurger implements Burger {

	@Override
	public String burger(String main) {
		System.out.println("B버거");
		System.out.println("🫓");
		System.out.println(main);
		System.out.println("🫓");
		
		return main+"버거";
	}

}
