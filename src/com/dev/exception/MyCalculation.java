package com.dev.exception;

public class MyCalculation{

	public static void main(String[] args) {
		int base=3, exponent = 4;
		double result=1;
		
		try {
		if(base<=0 || exponent<=0) {
			throw new CustomException();
		}
		
		else if (base>0 || exponent>0) {
			while(exponent != 0) {
				result *= base;
				--exponent;
				
			}
//			result = Math.pow(base, exponent);
			System.out.println("result = "+result);
		}
		
		}catch(Exception e) {
			
		}

	}

}
