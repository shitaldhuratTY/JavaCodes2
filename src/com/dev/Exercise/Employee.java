package com.dev.Exercise;

import java.util.HashMap;

public class Employee {

	public static void main(String[] args) {
		
		HashMap<String, EmlpoyeeData> hm = new HashMap<String, EmlpoyeeData>();
		
		EmlpoyeeData e = new EmlpoyeeData();
		e.setName("Shitu");
		e.setId(11);
		e.setEmail("d@gmail.com");
		e.setPassword("dddd");
		
		EmlpoyeeData e1 = new EmlpoyeeData();
		e1.setName("Piu");
		e1.setId(22);
		e1.setEmail("pp@gmail.com");
		e1.setPassword("pppp");
		
		e.setEmail("shhhh@gmail.com");
		e1.setEmail("puuu@gmail.com");
		
		 hm.put("13", e);
		 hm.put("22", e1);
		System.out.println(hm);
		
		EmlpoyeeData f = hm.remove("22");
		System.out.println(f);
		System.out.println(hm);
		
		System.out.println("contansKey(): "+hm.containsKey("22"));
		System.out.println("containsValue(): "+hm.containsValue(e));
		System.out.println("size(): "+hm.size());
	}

}
