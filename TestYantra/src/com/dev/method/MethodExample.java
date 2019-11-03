package com.dev.method;

public class MethodExample {

	public static int j = 0;

	static MethodExample me = new MethodExample();
	public static void main(String[] args) {
		
		
		
		j = calArea(6);
		System.out.println("Area of square "+j);
		int area1 = me.areaRec(2,4);
		System.out.println("Area of Rectangle "+area1);


	}

	public static int calArea(int side)
	{
		int t = side*side;
		int n = me.areaRec(4,4);
		//System.out.println(n);
		return t;
	}
	public int areaRec(int len, int width)
	{
		j = len*width;;
		return j;
	}
	
}

