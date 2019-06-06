package sorularinCozumleri;

import java.util.Scanner;

public class IsminBasHarfiniYazdir {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.println("Isminizi giriniz.");
		String isim = klavye.next();
		System.out.println(isim.charAt(0));
	}

}
