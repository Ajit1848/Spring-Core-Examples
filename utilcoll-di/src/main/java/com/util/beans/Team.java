package com.util.beans;
import java.util.List;
public class Team {
	private int teamNo;
	private String teamName;
	private String country;
	private List<String> players;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<String> getPlayers() {
		return players;
	}
	public void setPlayers(List<String> players) {
		this.players = players;
	}
	@Override
	public String toString() {
		return "Team [teamNo=" + teamNo + ", teamName=" + teamName + ", country=" + country + ", players=" + players
				+ "]";
	}
	
	
}
