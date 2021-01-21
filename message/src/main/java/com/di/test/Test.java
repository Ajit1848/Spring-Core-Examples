package com.di.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.di.beans.MessageWriter;

public class Test {
	public static void main(String[] args) {
		BeanFactory beanFactory= new XmlBeanFactory(new ClassPathResource("com/di/common/application-context.xml"));
		MessageWriter messageWriter=beanFactory.getBean("messageWriter", MessageWriter.class);
		messageWriter.writeMessage("Good Morning");
	}
}
