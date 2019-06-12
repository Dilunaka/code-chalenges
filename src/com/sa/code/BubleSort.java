package com.sa.code;


public class BubleSort {
	
	public int[] sortArray(int[] array) {
		int temp; 
		for (int i =0; i< array.length;i++) {
			for(int j= i+1; j<array.length; j++) {
				if(array[j] < array[i]) {
					temp = array[j];
					array[j] = array[i];
				    array[i] = temp;
				}
			}
		}
		
		return array;
	}
	
	public static void main(String args[]) {
		int[] array = {1,2,34,94,34,7};
		array =  new BubleSort().sortArray(array);
		for (int x = 0; x < array.length; x++) {
			System.out.println(array[x]);
		}
	}

}
