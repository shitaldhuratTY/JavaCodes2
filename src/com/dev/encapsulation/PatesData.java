package com.dev.encapsulation;

public class PatesData {

	public static void main(String[] args) {

		Pates p1 = new Pates();
		Pates p2 = new Pates();
		Pates p3 = new Pates();
		Pates p4 = new Pates();
		
		p1.setAge(1);
		p1.setPates_Name("Cat");
		p1.setName("Juli");
		p1.setColor("White");
		p1.setQuelity("Jumping");
		
		p2.setAge(2);
		p2.setPates_Name("Parrot");
		p2.setName("Piu");
		p2.setColor("Green");
		p2.setQuelity("Singing");
		
		p3.setAge(2);
		p3.setPates_Name("Dog");
		p3.setName("Domu");
		p3.setColor("White");
		p3.setQuelity("Dance");
		
		p4.setAge(1);
		p4.setPates_Name("Tortois");
		p4.setName("Toto");
		p4.setColor("Brown & Black");
		
		Pates [] pat = {p1,p2,p3,p4};
		
		for(int i=0; i<pat.length; i++) {
			System.out.println("Age: "+pat[i].getPates_Name());
			System.out.println("Age: "+pat[i].getAge());
			System.out.println("Name: "+pat[i].getName());
			System.out.println("Color: "+pat[i].getColor());
			System.out.println("Breed: "+pat[i].getQuelity());
			System.out.println("***************************");
		}		
	
		
	}

}
