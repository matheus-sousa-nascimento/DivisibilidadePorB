/*
 * ADivisivelPorB.java
 * 
 * Copyright 2023 maahs <maahs@DESKTOP-HHLOEHM>
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class ADivisivelPorB {
	
	public static void main (String[] args) {
		int a = 0;
		int b = 0;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Digite um numero de 0 ate 1000: ");
		a = teclado.nextInt();
		
		System.out.print("Digite um numero de 0 ate 20: ");
		b = teclado.nextInt();
		
		String res = ((a >= 0 && a <= 1000) && (b >= 0 && b <= 20)) ? ((a % b == 0) ? "a e divisivel por b" : 
					 "Nao e divisivel") : "Valores invalidos. Digite outro numero!";
		
		System.out.println(res);

	}
}

