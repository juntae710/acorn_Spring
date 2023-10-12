package com.acorm.day5.ex;

public class ExceptionTest1 {

	public int add (int num1,int num2) throws Exception {
		
		if(num1 <0 || num2<0) {
			throw new Exception("0보다 커야함");
		}
		return num1+num2;
	}
	public static void main(String[] args) throws Exception{
		ExceptionTest1 ex = new ExceptionTest1();
		try {
			int result= ex.add(1, -1);
			System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("음수인 값이 있습니다.");
			throw e;
		}
		
		System.out.println("정상종료");
	}
	
}
