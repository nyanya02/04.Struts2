package com.internousdev.webproj4.dto;

public class HelloStrutsDTO {

	private int userID;
	private String username;
	private String password;
	private String result;

	public int getUserID(){
		return userID;
	}
	public void setUserID(int userID){
		this.userID = userID;
	}

	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username = username;
	}

	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}

	public String getResult(){
		return result;
	}
	public void setResult(String result){
		this.result = result;
	}
}
