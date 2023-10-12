package com.acorm.day5.ex;

public class ExceptionTest0 {
	public static void main(String[] args) {
		ExceptionTest0 ex = new ExceptionTest0();
		
		try {
			ex.method();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("나머지 부분 처리");
		}
		System.out.println("정상종료");
	}

	public void method() throws Exception {
		// 조건인 때
		try {
		throw new Exception();
		}catch(Exception ex) {
			System.out.println("예외상황 인식하고 적절한 코드");
			throw ex;
		}
	}
}
