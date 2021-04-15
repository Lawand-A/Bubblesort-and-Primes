package primes;

import java.util.Arrays;
 
public class Primes {

// method for converting array to string 
	public static String arrayToString(int[] array){
		String result = Arrays.toString(array);
		return result;
	}

//Fill the array with number from 2 untill n
	public static int[] fillArray(int n){
		int[] array = new int[n-1];
		String result = "[";
		for(int i = 0; i < array.length; i++ ) {
			array[i] = 2+i;
		}
		return array;
	}

//Filter the numbers which are divisiblewith the element of the index (index) in the array
	public static void filterArray(int [] array, int index) {
		if (array[index] != -1) {
			for(int i = index+1; i < array.length; i++ ) {
				if (array[i] % array[index] == 0) {
					array[i] = -1;  //replace those elements by -1
				}
			}
		}
	}
//Print all prime numbers in range of n
	static void primes (int n) {
		int [] array = fillArray(n);
		String result = "[";
		for (int i = 0; i < array.length; i++) {
			if (array[i] != -1) {
				filterArray(array, i);
			}
		}
		for (int j = 0; j < array.length; j++) {
			if(array[j] != -1) {
				result = result + String.format("%d, ", array[j]);
			}
		}
		result = result.substring(0, result.length()-2);
		result = result + "]";
		System.out.println(result);
	}

	public static void main(String[] args) {
		int [] array = fillArray(100);
		filterArray(array,0);
		System.out.println(arrayToString(array));
		primes(100);
	}

}