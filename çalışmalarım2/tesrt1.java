/*
 *   // eriþim belirleyici(opsiyonel) ,ekstra ozellikler- donüþ tipi , fonlsiyon adý (parametreler)  {
 *   
 *   
 *   // burasý fonksiyon bloðu
 *   //fonlsiyonun yapacagý iþemler burda olacak.
 *   }
 * 
 * 
 * 
 * 
 * 
 * 
 */





package fonksiyonlaragiris;

import java.util.Scanner;

public class tesrt1 {
	
	public static  void faktoriyel() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("sayý; ");
		 int sayi= scanner.nextInt();
		 int faktoriyel=1;
		 
		 while(sayi>0) {
		
		faktoriyel*=sayi;
		sayi--;
		 }
		
		 System.out.println("faktoriyel:" + faktoriyel);
	}
	

	public static void main(String[] args) {
		
		
		faktoriyel();
		
		
		
		

	}

}
