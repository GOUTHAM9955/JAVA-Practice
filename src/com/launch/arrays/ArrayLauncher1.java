package com.launch.arrays;

import java.util.Scanner;

/*
 * Array is treated as an object in Java. So it is sored in Heap area.
 * Syntax is int []array1 = new int[5];
 * Int - > of type integer
 * [] - > one dimentional
 * new int[5] -> a memory of 5 units will allocated in heap area with zero as default value.
 */
//Simple array implementation
class MarksArray{
	int []arrayOfMarks = new int[5]; 
	
	//If we know the data at the time of declaration we can use the following syntax
	int arr1[] = {1,2,3,4};
	void marksEntry() {
		for(int i=0; i< arrayOfMarks.length ;i++) {
			System.out.println("Enter marks for subject" + i);
			Scanner scan = new Scanner(System.in);
			arrayOfMarks[i] = scan.nextInt();
			scan.close();
		}
		}
		void printMarks() {
			System.out.println("Marks you entered are");
		for(int i=0; i< arrayOfMarks.length ;i++) {
				System.out.print(" "+arrayOfMarks[i]);
			}
		System.out.println();
		}
}

// 2D Array Regular
/*
 * Let us consider there are 3 classes and each class has 4 students. We can define that in a 2D Regular Array as below
 * int [][]arMarks = new int[3][4]; 
 * Memory Map >>
 * 					_____		  0  1  2  3
 *  				|__0__| >>>  |_||_||_||_|
 * arMarks>>>>>> 	|__1__| >>>  |_||_||_||_|
 *  				|__2__| >>>  |_||_||_||_|
 *
 * So from the above memory map we can see that if we do ar.lenght we will get 3 and if we do ar[1].length we get 4
 *
 */

class Array2D{
	
	//If we know the data at the time of declaration we can use the following syntax
	int arr2[][] = {{1,2,3,4},{1,2,3}};
	
	void arrayMarks2() {
		String [][]arrayMarks = new String[3][4];
		for(int i=0; i < arrayMarks.length; i++) {
			for (int j=0; j< arrayMarks[i].length;j++ ) {
				arrayMarks[i][j] = String.valueOf(i)+ String.valueOf(j);
			}
		}
		
		for(int i=0; i < arrayMarks.length; i++) {
			for (int j=0; j< arrayMarks[i].length;j++ ) {
				System.out.print(" "+ arrayMarks[i][j]);;
			}
			System.out.println();
		}
	}
}

// IRREGULAR or JAGGED 2D ARRAY
/*
 *To define an irregular or jagged array we initially define the vertical dimention(row ) length of the array leaving the other dimention
 * empty and specifying the indvidual length later
 * 
 * Ex: int [][]arrayMarks3 = new int[3][];
 *   arrayMarks3[0] = new int[3];
 *   arrayMarks3[1] = new int[5];
 *   arrayMarks3[2] = new int[4];
 */


public class ArrayLauncher1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarksArray ma = new MarksArray();
		//ma.marksEntry();
		//ma.printMarks();
		
		Array2D ma2 = new Array2D();
		ma2.arrayMarks2();
	}

}


//Limitations with Array 
/*
* Array can have only homogenious data
* Array size is fixed
* Array demands contiguous memory location
* Array is treated as an object and memory is allocated in heap area
* Array in java are guarded with boundaries, if we surpass the boundaries it will lead to ArrayIndexOutOfBoundsException in runtime
* Array size must be of integer type and range shouldn't surpass integer data type range
* Array size cannot be -ve, if we try to make the size of an array as -ve it will give NegativeArraySizeException at runtime
*/

