package com.cg.localdatetime;
//Program on date time Formatter

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeProgram {

	public static void main(String[] args) {
		String datetime="2022-07-31 22:59";
		//DateTimeFormatter is used to date Format
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime ld=LocalDateTime.parse(datetime,df);
		System.out.println(ld);
	
	}

}
