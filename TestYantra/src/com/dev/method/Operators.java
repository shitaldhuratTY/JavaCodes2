package com.dev.method;

public class Operators {
	static Operators o = new Operators();
	
	final void add(int i, int j) {
		int res = i+j;
		System.out.println(" Result of add operation with 2 arguments "+res);	
	}
	
	final void add(int i, int j,int k) {
		int res = i+j+k;
		System.out.println(" Result of add operation with 3 arguments "+res);	
	}
	
	private void add(int i, int j,int k, float f) {
		float res = i+j+k+f;
		System.out.println(" Result of add operation with 4 arguments "+res);	
	}
	
	private void sub(int i, int j) {
		int res = i-j;
		System.out.println(" Result of Sub operation with 2 arguments "+res);		
	}
	
	public void sub(int i, int j, int k) {
		int res = i-j-k;
		System.out.println(" Result of Sub operation with 3 arguments  "+res);
		
	}
	
	public void sub(int i, int j, int k, int l) {
		int res = i-j-k-l;
		System.out.println(" Result of Sub operation with 4 arguments  "+res);
		
	}
	
	public void mul(int i, int j) {
		int res = i*j;
		System.out.println(" Result of multiplication operation with 2 arguments "+res);	
	}
	
	public void mul(int i, int j,int k) {
		int res = i*j*k;
		System.out.println(" Result of multi operation with 3 arguments "+res);	
	}
	
	public void mul(int i, int j, int k, int l) {
		int res = i*j*k*l;
		System.out.println(" Result of multi operation with 4 arguments "+res);	
	}
	
	public void div(int i,int j) {
		int res = i/j;
		System.out.println(" Result of Divi operation with 2 arguments "+res);	
	}
	
	public void div(int i,int j,int k) {
		int res = i/(j/k);
		System.out.println(" Result of Divi operation with 3 arguments "+res);	
	}
	
	public void div(int i,int j,int k, int l) {
		int res = i/j/(k/l);
		System.out.println(" Result of Divi operation with 4 arguments "+res);	
	}
	
	public static void main(String[] args) {
		o.add(5, 5);
		o.add(10, 10,20);
		o.sub(20, 30,40);
				
	}

}
