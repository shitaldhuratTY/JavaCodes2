package com.tyss.usttyspringcore;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.usttyspringcore.beans.Animal;
import com.tyss.usttyspringcore.beans.Author;
import com.tyss.usttyspringcore.beans.HelloWorld;
import com.tyss.usttyspringcore.beans.Pet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld obj2 = context.getBean(HelloWorld.class);
//		System.out.println(obj2.getMsg());
//		obj2.getAnimal().makeSound();
		System.out.println(obj2.getMap());
		
		System.out.println("*********************");
		
		/*Animal animal = (Animal) context.getBean(Animal.class);
		animal.makeSound();*/
		
		Animal animal = (Animal) context.getBean("dog");
		animal.makeSound();
		
		System.out.println("*********************");
		
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
		context.close();
		
		
	
		
    }
}
