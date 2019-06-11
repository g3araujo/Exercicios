package course;

import java.util.Scanner;
import java.util.Locale;

public class E20190611c {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, tri, cir, tra, qua, ret;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		tri = (A * C) / 2;
		cir = 3.14159 * C * C;
		tra = ((A * B) / 2) * C;
		qua = B * B;
		ret = A * B;
		
		System.out.printf("TRIANGULO: %.4f%n", tri);
		System.out.printf("CIRCULO: %.4f%n", cir);
		System.out.printf("TRAPEZIO: %.4f%n", tra);
		System.out.printf("QUADRADO: %.4f%n", qua);
		System.out.printf("RETANGULO: %.4f%n", ret);
		
		sc.close();
	}

}
