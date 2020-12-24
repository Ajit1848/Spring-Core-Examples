package com.utilcdi.bean;

import java.util.Map;

public class Players {
	private Map<String, String> map;

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Players [map=" + map + "]";
	}

	
	
	

}
