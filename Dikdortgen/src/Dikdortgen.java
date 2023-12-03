import java.util.Scanner;

public class Dikdortgen {

	public static void main(String[] args) {
		System.out.println("Birinci kenari giriniz:");
		Scanner input= new Scanner(System.in);
		int sayi= input.nextInt();
		
		System.out.println("İkinci kenari giriniz:");
		
		Scanner input2= new Scanner(System.in);
		int sayi2= input.nextInt();
		
		for(int i=0; i<sayi;i++) {
			for(int j=0; j<sayi2;j++) {
			
				System.out.print("*");
			}
			
			
			System.out.println();
			
			
		}
		

	}

}
