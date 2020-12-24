package com.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.Radio;
public class BeanAutowWringTest {
	public static void main(String[] args) {
		BeanFactory beanFactory= new XmlBeanFactory(new ClassPathResource("com/ba/common/application-context.xml"));
		Radio radio=beanFactory.getBean("radio", Radio.class);
		System.out.println(radio);
	}
}
