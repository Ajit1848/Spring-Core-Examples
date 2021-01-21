package com.ai.beans;

import java.util.List;
import java.util.UUID;

public class ZomatoDeliveryPartnerImpl implements IDeliveryPartner{
	@Override
	public String delivery(List<String> item, String address, String orderNo) {
		System.out.println(item);
		System.out.println(address);
		System.out.println(orderNo);
		return "Order Delivered: Zo-"+UUID.randomUUID().toString();
	}
}
