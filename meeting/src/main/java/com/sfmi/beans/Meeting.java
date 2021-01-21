package com.sfmi.beans;

import java.util.Calendar;
import java.util.List;

public class Meeting {
	private String topic;
	private String description;
	private List<String> participants;
	private Calendar time;
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setParticipants(List<String> participants) {
		this.participants = participants;
	}
	public void setTime(Calendar time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Meeting [topic=" + topic + ", description=" + description + ", participants=" + participants + ", time="
				+ time + "]";
	}
	
	
}
