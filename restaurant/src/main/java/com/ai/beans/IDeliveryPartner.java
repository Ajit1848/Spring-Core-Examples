package com.ai.beans;

import java.util.List;

public interface IDeliveryPartner {
	public String delivery(List<String> item,String address, String orderNo);
}
