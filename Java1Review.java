import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
public class Java1Review {
	
public static void main(String[] args) {
	
	}

	public static String main(String s) {
		String a = "Overloaded main method was passed \"" + s + "\".";
	
		return a;
}
	
	public static double divide(double a, double b) {
		
		return a/b;
		
	}

	public static int divide(int a, int b) {
		
		return a/b;
			
	}
	
	public static boolean isDivisibleBy7(int x) {
		if (x % 7 == 0) {
			return true;
		}
		else {
			return false;
		}
			
		}
	
	public static int findMin(int a, int b, int c) {
		int minVal = a;
		if (b < a && b < c) {
			minVal = b;
		}
		else if(b > c && a > c) {
			minVal = c;
		}
		return minVal;
		}
		
	public static int findMin(int [] array) {
		int minVal = array[0];
		for (int i = 1; i < array.length ; i++) {
			if (array[i] < minVal){
				minVal = array[i];
		}
		}
		return minVal;
		
		
	}
	
	public static double average(int [] array) {
		double total = 0.0;
		double answer = 0.0;
		for(int i = 0; i < array.length; i++) {
			total = total + array[i];
		}
		answer = total/array.length;
		return answer;
	}
	
	public static String[] toLowerCase(String [] array) {
		
		
		for(int i = 0; i < array.length; i++) {
			array[i] = array[i].toLowerCase();
		}
		return array;
	}
	
	public static String[] toLowerCaseCopy(String [] array) {
		
		String[] copy = new String[array.length];
		for(int i = 0; i < array.length; i++) {
			copy[i] = array[i].toLowerCase();
		}
		return copy;
	}
	
	public static int[] removeDuplicates(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int temp = array[i];
			int count = 0;
			
			for(int j = 0; j < array.length; j++) {
				if(array[j] == temp && j != i) {
					array[j] = 0;
					count++;
				}
				if (count > 0) {
					array[i] = 0;
				}
			}
		}
		System.out.println(Arrays.toString(array));
		return array;
	}
	
	
		
			
		
		

	
}



