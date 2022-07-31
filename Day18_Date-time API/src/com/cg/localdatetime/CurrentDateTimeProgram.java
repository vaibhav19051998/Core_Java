package com.cg.localdatetime;
// Program on Current Date Time

import java.time.LocalDate;
import java.time.LocalTime;

public class CurrentDateTimeProgram {

	public static void main(String[] args) {
		//Using Current Time
		LocalTime currentTime =LocalTime.now();
		System.out.println(currentTime);
		//Using Current Date
		LocalDate cd=LocalDate.now();
		System.out.println(cd);
		
	
	}

}
