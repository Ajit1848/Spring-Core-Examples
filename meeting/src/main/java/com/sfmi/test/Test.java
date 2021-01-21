package com.sfmi.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.sfmi.beans.Meeting;

public class Test {
	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory= new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("com/sfmi/common/application-context.xml"));
		Meeting meeting=beanFactory.getBean("meeting", Meeting.class);
		System.out.println(meeting);
	}
}
