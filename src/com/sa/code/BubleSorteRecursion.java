package com.sa.code;
import java.util.Arrays;

public class BubleSorteRecursion {
	
	public void bubleSort(int[] array, int length) {
		if(length == 1) 
			return;
		
		for(int i = 0; i < length -1; i++) {
			if (array[i+1] < array[i]) {
				int temp = array[i+1];
				array[i+1] = array[i];
				array[i] = temp;
			}
			bubleSort(array, length - 1);
		}
	}
	
	public static void main(String args[]) {
		int[] array = {11,7,8,1,2,4,5,6,9,3};
		new BubleSorteRecursion().bubleSort(array, array.length);
		System.out.println(Arrays.toString(array));
	}
}
