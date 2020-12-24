package com.di.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.di.bean.Student;

public class Test {

	public static void main(String[] args) {
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("com/di/common/application-context.xml"));
		Student student=beanFactory.getBean("student", Student.class);
		System.out.println(student);
	}
}
