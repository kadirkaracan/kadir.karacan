package dizi3;

  
import java.util.Iterator;
import java.util.Scanner;

public class dizi3 {

	public static void main(String[] args) {
		// dizinin elemanlarýný kullanýcýdan alma
		Scanner scanner = new Scanner(System.in);
		System.out.println("dizi kaç elemanlý olsun");

		int diziuzunluk = scanner.nextInt();
		scanner.nextLine();
		String[]  isimler= new String[diziuzunluk];
		

for (int i = 0; i < diziuzunluk; i++) {
			System.out.println("dizinin"+ (i)+".index deðerini giriniz:");
			
			isimler[i]=scanner.nextLine();
			
			
			
		}
for (int i = 0; i < isimler.length; i++) {
	System.out.println(isimler[i]);
}


	}

}
