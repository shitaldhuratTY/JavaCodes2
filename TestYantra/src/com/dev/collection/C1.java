package com.dev.collection;

import java.util.HashSet;

import com.dev.encapsulation.Dog;



public class C1 {

	public static void main(String[] args) {
		
		HashSet<Dog>hs = new HashSet<Dog>();
		Dog d = new Dog();
		d.setAge(1);
		d.setBreed("D M");
		d.setName("Shiro");
		d.setColor("Black");
		
		Dog d1 = new Dog();
		d1.setAge(2);
		d1.setBreed("Dalmation");
		d1.setName("Roni");
		d1.setColor("Black & White");
		
		Dog d2 = new Dog();
		d2.setAge(2);
		d2.setBreed("Dalmation");
		d2.setName("Moti");
		d2.setColor("White");
		
		d.setAge(2);
		d1.setAge(3);
		d2.setAge(5);
		
		boolean b = hs.add(d);
		boolean b1 = hs.add(d1);
		boolean b3 = hs.add(d2);
		System.out.println("Output of add(): "+b+" "+b1+""+b3);
//		System.out.println(hs);
		
		for(Dog dog: hs) {    // for each loop,  we can't write foreach for HashMap because it dosen't Iterable
			System.out.println(dog);
		}
		
//		System.out.println("Size of HashSet hs : "+hs.size());
//		
//		boolean b2 = hs.remove(d);
//		System.out.println("Output of remove(): "+b2);
//		System.out.println(hs);
//		
//		System.out.println("Output of cotains(): "+hs.contains(d1));
//		System.out.println("Size of HashSet hs after remove() : "+hs.size());
//		
//		hs.clear();
//		System.out.println("Size of HashSet hs after clean(): "+hs.size());
	}


}
