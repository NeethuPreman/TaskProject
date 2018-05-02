package com;


import java.util.Calendar;
import java.util.Date;

public class Fridays{

	public static void main(String args[]) {

	    @SuppressWarnings("deprecation")
		Date startDate = new Date(1901, Calendar.JANUARY, 01);
	    @SuppressWarnings("deprecation")
		Date endDate = new Date(2000, Calendar.DECEMBER, 31);

	    checkSundays(startDate, endDate);
	}

	private static void checkSundays(Date start, Date end) {
	    int dayNum;

	    Calendar startDate = Calendar.getInstance();
	    startDate.setTime(start);

	    Calendar endDate = Calendar.getInstance();
	    endDate.setTime(end);
	    
	    int count = 0;

	    while (startDate.before(endDate)) {
	        for (int i = 1; i < 13; i++) {
	            dayNum = startDate.get(Calendar.DAY_OF_WEEK);
	            if (dayNum == 1) {
	                count++;
	            }
	              startDate.add(Calendar.MONTH, 1);

	        }
}
	    System.out.println("No of sundays= " + count);
	}
}
