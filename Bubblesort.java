package bubblesort;

import java.util.Arrays;
import java.util.Random;

public class Bubblesort {


//This method convert an int Array to string 
	public static String arrayToString(int[] array){
		String result = Arrays.toString(array);
		return result;
	}
	
//This method generate an Array of the length n with random numbers in it
	public static int[] randomArray (int n) {
		Random rand = new Random();
		int[] array = new int[n];
		for(int i = 0; i < n; i++ ) {
			int randNum = rand.nextInt(100);
			array[i] = randNum;
		}	
		return array;
	}

//The Bubble Sort algorithm
	public static void bubbleSort(int[] array) {
		int tmp;
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if(array[j] < array[j+1]) {
					tmp = array[j+1];
					array[j+1] = array[j];
					array[j] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = randomArray(15);
		System.out.println(arrayToString(array));
		bubbleSort(array);
		System.out.println(arrayToString(array));
	}
}