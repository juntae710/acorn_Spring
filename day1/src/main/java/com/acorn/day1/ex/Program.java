package com.acorn.day1.ex;

public class Program {

	Burger burger;
	
	public Program() {
		// TODO Auto-generated constructor stub
	}

	public Program(Burger burger) {
		super();
		this.burger = burger;
	}
	
	public void setBurger(Burger burger) {
		this.burger = burger;
	}
	public String add (String main) {
		String result;
		result = burger.burger(main);
		return result;
	}
}
