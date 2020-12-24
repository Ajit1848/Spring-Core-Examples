package com.util.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.util.beans.Team;

public class Test {
	public static void main(String[] args) {
		BeanFactory beanFactory= new XmlBeanFactory(new ClassPathResource("com/util/common/application-context.xml"));
		Team team=beanFactory.getBean("team", Team.class);
		System.out.println(team);
	}
}
