package course;

import java.util.Scanner;
import java.util.Locale;

public class E20190611d {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int ano, mes, dia, dias;
		
		ano  = sc.nextInt();
		mes  = sc.nextInt();
		dia  = sc.nextInt();
		dias = ano * 365 + mes * 30 + dia;
		
		System.out.printf("%d anos, %d meses e %d dias = %d dias", ano, mes, dia, dias);

		sc.close();

	}

}
