package dizi3;

  
import java.util.Iterator;
import java.util.Scanner;

public class dizi3 {

	public static void main(String[] args) {
		// dizinin elemanlar�n� kullan�c�dan alma
		Scanner scanner = new Scanner(System.in);
		System.out.println("dizi ka� elemanl� olsun");

		int diziuzunluk = scanner.nextInt();
		scanner.nextLine();
		String[]  isimler= new String[diziuzunluk];
		

for (int i = 0; i < diziuzunluk; i++) {
			System.out.println("dizinin"+ (i)+".index de�erini giriniz:");
			
			isimler[i]=scanner.nextLine();
			
			
			
		}
for (int i = 0; i < isimler.length; i++) {
	System.out.println(isimler[i]);
}


	}

}
