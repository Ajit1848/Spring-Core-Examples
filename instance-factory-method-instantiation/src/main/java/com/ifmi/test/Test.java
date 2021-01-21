package com.ifmi.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.policybazar.beans.PolicyBazar;

public class Test {
	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory= new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions("com/ifmi/common/aplication-context.xml");
		
		PolicyBazar policyBazar=beanFactory.getBean("policyBazar", PolicyBazar.class);
		double total=policyBazar.getQuote(2017,"Two Wheeler","Petrol","Life Time",150000);
		System.out.println(total);
	}
}
