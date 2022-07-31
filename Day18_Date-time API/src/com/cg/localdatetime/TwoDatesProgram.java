package com.cg.localdatetime;
//program on calculate days between two dates

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TwoDatesProgram {

	public static void main(String[] args) 
	{
		
		LocalDate days=LocalDate.now();
		//plusDaya() is used to adding the days in current date
		LocalDate days1=days.plusDays(10);// Adding 10days in current date
		System.out.println(days1);
		//ChronoUnit.DAYS shows the difference between two dates
		long A=ChronoUnit.DAYS.between(days, days1);
		System.out.println(A);
	}

}
