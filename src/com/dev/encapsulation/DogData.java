package com.dev.encapsulation;

public class DogData {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		d1.setAge(1);
		d1.setBreed("Dober Man");
		d1.setColor("Black");
		d1.setName("Shiro");
		
		d2.setAge(3);
		d2.setBreed("German Shepherd");
		d2.setColor("Black & Brown");
		d2.setName("Abby");
		
		d3.setAge(3);
		d3.setBreed("German Shepherd");
		d3.setColor("Black & Brown");
		d3.setName("Abby");
		
		
		Dog [] dogs = {d1,d2,d3};
		
		for(int i=0; i<dogs.length; i++) {
			System.out.println("Age: "+dogs[i].getAge());
			System.out.println("Name: "+dogs[i].getName());
			System.out.println("Color: "+dogs[i].getColor());
			System.out.println("Breed: "+dogs[i].getBreed());
			System.out.println("***************************");
		}
		
		
		System.out.println(d3.equals(4));
		System.out.println(d3.hashCode());
		
		
	}

}
