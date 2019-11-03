package com.dev.collection;

import java.util.HashMap;

import com.dev.encapsulation.Dog;

public class C2 {
	public static void main(String[] args) {
		HashMap<String, Dog> hm = new HashMap<String, Dog>();
		
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
		
		hm.put("1", d);
	//	Dog b = hm.put("1", d);  // If we use first time key than it will give null.
	//	System.out.println(b);
		
		hm.put("2", d1);
		hm.put("3", d2);
		System.out.println(hm);
		
		Dog f = hm.remove("2");     // return type of remove() is object	
		System.out.println(f);
		System.out.println(hm);
		
		System.out.println("Output of containtsKey(): " +hm.containsKey("1"));
		
		System.out.println("Output of containtsValue(): " +hm.containsValue(d2));
		
		
	}

}
