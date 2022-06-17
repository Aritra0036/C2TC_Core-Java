package com.cg.enums;

public class ExEnum {
	 enum Day{
		Sunday,Monday,Tuesday,Wednesday,Thusday,Friday,Saturday;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day day = Day.Saturday;
		switch(day) {
		case Sunday :
		System.out.println("Moving towords Monday");
	    break;
		
		case Friday :
		System.out.println("Hurrah! weekend");
		break;
		
		default:
		System.out.println("other day");
		
		}

	}
}

