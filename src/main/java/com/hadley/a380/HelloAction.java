package com.hadley.a380;

public class HelloAction {

	String username = "root";
	String password = "123456";

	public String getName(int type) {
		// TODO Auto-generated method stub
		if (type == 0) {
			return "A";
		}
		return "B";
	}
	
	public String getDefaultCabin(String passenger){
		if("weiyi".equals(passenger)){
			return "F";
		}
		return "Y";
	}
	
	public String getSeatNum(String passenger){
		if("weiyi".equals(passenger)){
			return "1A";
		}
		return "40C";
	}

}
