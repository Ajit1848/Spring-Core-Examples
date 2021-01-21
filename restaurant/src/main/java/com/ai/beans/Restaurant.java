package com.ai.beans;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Restaurant implements BeanFactoryAware{
	BeanFactory beanFactory;
	IDeliveryPartner deliveryPartner;
	List<String> item;
	String address;
	String orderNo;
	String deliveryPartnerName;
	public void dispatchOrder()
	{
		deliveryPartner=beanFactory.getBean(deliveryPartnerName, IDeliveryPartner.class);
		String dispatchNo=deliveryPartner.delivery(item,address,orderNo);
		System.out.println(dispatchNo);
	}
	public void setItem(List<String> item) {
		this.item = item;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
	public void setDeliveryPartnerName(String deliveryPartnerName) {
		this.deliveryPartnerName = deliveryPartnerName;
	}
public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
	this.beanFactory=beanFactory;
}
}
