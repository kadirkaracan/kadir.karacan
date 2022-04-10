package mafsav;

import java.lang.reflect.Array;
import java.util.Arrays;

public class mki {
	public static void mean(int [] arr ) {
		int total=0;
		for (int i = 0; i < arr.length; i++) {
			total+= arr[i];
			
		}
	System.out.println("ortalama: "+ (double)total/arr.length);

	}
	
	
	
	public static void main(String[] args) {
		int [] arr1= {10,20,30,40,50} ;  
		
		 mean(arr1);
		 System.out.println();
		 
		 System.out.println("array 1 in deðerleri: " +Arrays.toString(arr1));
	}

}
