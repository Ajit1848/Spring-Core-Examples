package com.ai.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Car implements BeanFactoryAware{
	BeanFactory beanFactory;
	private String engineName;
public void start()
{
	IEngine engine;
	
	engine=  beanFactory.getBean(engineName,IEngine.class);
	engine.engine();
	System.out.println("Car Started...");
}

public void setEngineName(String engineName) {
	this.engineName = engineName;
}

public void setBeanFactory(BeanFactory beanFactory)
{
	this.beanFactory=beanFactory;
}
}
