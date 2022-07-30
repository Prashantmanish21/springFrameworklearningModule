package com.springboot.autowiring.withXml;

public class Time {
	private String time;
	
	public Time() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Time(String time) {
		super();
		this.time = time;
	}


	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Time [time=" + time + "]";
	};

}
