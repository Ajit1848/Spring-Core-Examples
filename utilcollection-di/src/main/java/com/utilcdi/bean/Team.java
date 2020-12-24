package com.utilcdi.bean;

import java.util.List;

public class Team {
	private int teamNo;
	private String teamName;
	private List<Players> list;
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public List<Players> getList() {
		return list;
	}
	public void setList(List<Players> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Team [teamNo=" + teamNo + ", teamName=" + teamName + ", list=" + list + "]";
	}
	
	
}
