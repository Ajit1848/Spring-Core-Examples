package com.utilcdi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.utilcdi.bean.Players;
import com.utilcdi.bean.Team;

public class Test {

	public static void main(String[] args) {
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("com/utilcdi/common/application-context.xml"));
		//Team team=beanFactory.getBean("team", Team.class);
		// System.out.println(team);
		
		//Players players=beanFactory.getBean("players", Players.class);
		//System.out.println(players);
	}
}
