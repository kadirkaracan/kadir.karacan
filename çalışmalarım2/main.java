package arraylerveozellikleri;

import java.util.Scanner;

public class main {
public static void mean(int[] arr){
	int total=0;
	for (int i = 0; i < arr.length; i++) {
		total+= arr[i];
		
	}
	System.out.println("ortalama: "+(double) total/arr.length);
}
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
	int[] arr1= {10,20,30,40,50};
		int[] arr2= new int[5];
		System.out.println("array 2'nin deðerlerini giriniz..."); 
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=scanner.nextInt();
		}
		
		mean(arr2);
//		System.out.println("array 2'nin deðerleri: "); 
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println("eleman: "+ arr2[i]);	
//			}
//int[] arr2= new int[5];
//arr2[0]=1;
//arr2[1]=2;
//arr2[2]=3;
//arr2[3]=4;
//arr2[4]=5;

//System.out.println("array 2'nin birinci elemaný: "+ arr2[0]);
//System.out.println("array 1'nin ikinci elemaný: "+ arr1[1]);

//for (int i = 0; i < arr1.length; i++) {
//System.out.println("eleman: "+ arr1[i]);	
//}
	

	}

}
