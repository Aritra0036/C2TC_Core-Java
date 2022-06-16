package com.tns.array2D;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{42,2,41},{52,1,40},{67,9,12}};
		shuffle(arr);
		}
	public static void shuffle(int arr[][]) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println("");
		}
	}

}
