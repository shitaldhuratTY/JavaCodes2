package com.dev.collection;

import java.util.TreeSet;

import com.dev.encapsulation.Dog;

public class C3 {

	public static void main(String[] args) {

		TreeSet<Dog> ts = new TreeSet<Dog>();
		
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
		
		ts.add(d);
		ts.add(d1);
		ts.add(d2);
		
		System.out.println(ts);
	}

}
