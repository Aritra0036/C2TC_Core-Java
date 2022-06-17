package com.cg.enums;

public class ExampleEnum {
	public enum season{
		WINTER,SPRING,SUMMER,AUTUMN;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(season s: season.values()) {
			System.out.println(s);
		}
		System.out.println("The value of autumn is " +season.valueOf("AUTUMN"));
		System.out.println("The index of winter is " +season.valueOf("WINTER").ordinal());
		System.out.println("The index of winter is " +season.valueOf("WINTER").ordinal());
		System.out.println("The index of autumn is " +season.valueOf("AUTUMN").ordinal());

	}

}
