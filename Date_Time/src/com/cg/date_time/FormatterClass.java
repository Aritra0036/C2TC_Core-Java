package com.cg.date_time;

import java.time.format.DateTimeFormatter;

import java.time.LocalDateTime;

public class FormatterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime myDateobj= LocalDateTime.now();
		System.out.println("Before formatting what is your date? "+(myDateobj));
		DateTimeFormatter myFormatobj=DateTimeFormatter.ofPattern("E,dd/MMM/yyyy HH:MM:SS");
		String FormattedDate= myDateobj.format(myFormatobj);
		System.out.println("After formatting what is your date " +(FormattedDate));

	}

}
//E represent the current day
//MM along with one more M means MMM , the last M represent the month in words