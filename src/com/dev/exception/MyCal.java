package com.dev.exception;

public class MyCal{

	public static void main(String[] args) throws CustomException {
		int base=3, exponent = 0;
		double result=1;
		
	
		if(base<0 || exponent<0) {
			throw new CustomException(" Negative Exception occured ");
		}
		
		else if (base ==0 || exponent ==0) {
			throw new CustomException(" Zero Exception occured ");
		}
		
		else if (base>0 || exponent>0) {
			while(exponent != 0) {
				result *= base;
				--exponent;
				
			}
//			result = Math.pow(base, exponent);
			System.out.println("result = "+result);
		}

	}

}
