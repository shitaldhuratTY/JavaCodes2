package com.dev.collection;

import java.util.ArrayList;

import com.dev.encapsulation.Dog;

public class C4 {

	public static void main(String[] args) {
		
		ArrayList<Dog> ar1 = new 	ArrayList<Dog>(2);   // Array resize by itself internally.
		
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
		
		ar1.add(d);
		ar1.add(d1);
		ar1.add(d2);
		
		System.out.println(ar1);
		
		ar1.trimToSize();
		System.out.println("Size of arrayList after trmeToSize(): "+ar1.size());
		}

}
