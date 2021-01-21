package com.ai.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ai.beans.Restaurant;

public class Test {
	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions("com/ai/common/application-context.xml");
		Restaurant restaurant=beanFactory.getBean("restaurant", Restaurant.class);
		restaurant.dispatchOrder();
		
	}
}
