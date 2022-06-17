package com.cg.enums;

import com.cg.enums.ExampleEnum.season;

public class Example {
	public enum season{
		SUMMER(10),WINTER(5),SPRING(15),AUTUMN(20);
		int value;
		season(int value){
			this.value=value;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(season s : season.values()) {
			System.out.println(s+" "+s.value);
			
		}

	}

}
