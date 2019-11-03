package com.tyss.usttyspringcore.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcesser implements BeanPostProcessor {
	
	public Object postProcesserBeforeInitialization(Object bean, String beanName) throws  BeansException{
		
		if (beanName.equals("obj")) {
			System.out.println("Hello World before init");
			
		} else if(beanName.equals("dog")){
			System.out.println("Dog before init");
		}else {
			System.out.println("Bean Name:"+beanName);
		}
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	System.out.println("Bean name:"+beanName);
	return bean;
	}

}
