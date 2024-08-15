package com.launch.arrays;

import java.util.Arrays;

/*
 * The size of an array should be in the range of integer
 * The compiler 
 */

//Implementation of for each loop
class ForEach {
	int arr1[] = {1,2,3,4,5};
	int[] arr2[] = {{1,2,3,4},{5,6,7}};
	void printArr() {
		//For 1 dimentional array
		for(int i:arr1) {
			System.out.println(i);
		}
		
		//For 2 dimentional array 
		for (int i[]:arr2) {
			for (int j:i) {
				System.out.println(j);
			}
		}
	}
	
}

class ArrClass{
	{
		// Predefined class names

		int arr[] = new int[5]; // [I
		System.out.println(arr.getClass().getName());
		double arr2[] = new double[5]; //[D
		System.out.println(arr2.getClass().getName());
		
		double arr3[][] = new double[5][3]; //[[D
		System.out.println(arr3.getClass().getName());
		
		System.out.println();
	}
	
	/*
	 * When ever we want to modify the data in an array we can do it in two ways 1) Write your own logic or 
	 * 		2) Use prefied utility class "Arrays" static methods
	 */
	{
		System.out.println("Data after sorting");
		int arr4[] = {5,3,1,2,4};
		Arrays.sort(arr4);
		System.out.println("Data after sorting");
		for(int i:arr4) {
			System.out.print(i+ " ");
		}
	}
}




public class ArrayLauncher2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrClass arr = new ArrClass();
		

	}

}
