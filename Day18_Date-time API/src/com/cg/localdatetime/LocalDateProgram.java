package com.cg.localdatetime;
//Program on LocalDateTime 
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateProgram {

	public static void main(String[] args) 
	{
		//Using Local Date
		LocalDate l=LocalDate.now();
		System.out.println(l);
		LocalDate L=LocalDate.of( 2022, Month.MAY, 31);
		System.out.println(L);
		//Using local Time
		LocalTime t=LocalTime.now();
		System.out.println(t);
		//Using Local Date Time 
		LocalDateTime T=LocalDateTime.now();
		System.out.println(T);
		


	}

}
