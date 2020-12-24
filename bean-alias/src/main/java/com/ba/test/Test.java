package com.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.Library;

public class Test {
	public static void main(String[] args) {
		BeanFactory beanFactory= new XmlBeanFactory(new ClassPathResource("com/ba/common/application-context.xml"));
		Library library=beanFactory.getBean("gramLibrary", Library.class);
		System.out.println(library);
	}
}
