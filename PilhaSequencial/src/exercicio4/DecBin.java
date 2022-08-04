package exercicio4;

import java.util.Scanner;

import tipoPilha.TipoPilhaInt;

public class DecBin {

	public static void main(String[] args) {
		
		TipoPilhaInt pilha = new TipoPilhaInt();
		pilha.init();
		
		Scanner le = new Scanner(System.in);
		System.out.print("Valor em decimal: ");
		int decimal = le.nextInt();
		int resto;
		while (decimal != 0) {
			resto = decimal % 2;
			pilha.push(resto);
			decimal = decimal / 2;
		}
		
		System.out.println("Valor em binário: ");
		pilha.esvazia();
		le.close();

	}

}
