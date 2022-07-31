package com.cg.localdatetime;
// Program on zoned Date Time using zone-Ids

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class ZoneDateTimeProgram1 {

	public static void main(String[] args)
	{
		//Local Time using ZoneId is used to show time of different zones
		LocalTime t=LocalTime.now(ZoneId.of("US/Pacific"));
		LocalDateTime L=LocalDateTime.now(ZoneId.of("GMT"));
		System.out.println(t);
		System.out.println(L);
		//getAvailableZoneIds() is used to shows Time of all available zones
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);

		}
	}

}
