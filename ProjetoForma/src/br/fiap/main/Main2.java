package br.fiap.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.fiap.forma.Cilindro;
import br.fiap.forma.Circulo;
import br.fiap.forma.Forma;

public class Main2 {
	public static void main(String[] args) {
		
		List<Forma> lista = new LinkedList<Forma>();
		
		lista.add(new Circulo(2, 2, 2));
		lista.add(new Cilindro(4, 4, 4, 3));
		lista.add(new Circulo(3, 3, 3));
		
		// impressão dos dados
		Forma aux;
		for(int i = 0; i < lista.size(); i++) {
			aux = lista.get(i);
			System.out.println(aux); // aux.toString();
			System.out.println();
		}

	}
}
