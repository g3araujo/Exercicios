package course;

import java.util.Scanner;

public class E20190610 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = n1 + n2;
		
		System.out.printf("SOMA = %.2f%n", n3);
		
		sc.close();

	}

}
