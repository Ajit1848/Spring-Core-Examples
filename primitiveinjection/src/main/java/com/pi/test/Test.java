package com.pi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pi.beans.Employee;

public class Test {
	public static void main(String[] args) {
		BeanFactory beanFactory= new XmlBeanFactory(new ClassPathResource("com/pi/common/application-context.xml"));
		Employee employee=beanFactory.getBean("employee", Employee.class);
		System.out.println(employee);
	}
}
