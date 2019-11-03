/* WAP to find the sum of mid element, first element and 2nd last element of an 
   array of size 7.
*/

package com.dev.Exercise;

public class SumEelements {

	public static void main(String[] args) {
	int arr[] = {1,2,3,4,5,10,7};
	int len = arr.length-2;
	int mid = (arr[0]+len)/2;
	int sum= arr[0]+mid+arr[len];
	
	System.out.println("First element : "+arr[0]);
	System.out.println("Mid element : "+mid);
	System.out.println("Second last element : "+arr[len]);
	System.out.println("Sum of elements: "+sum);

	}

}
