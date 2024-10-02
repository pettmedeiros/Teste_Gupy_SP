package aplication;

import java.util.ArrayList;
import java.util.List;

import entities.Estado;

public class program {

	public static void main(String[] args) {
		List<Estado> estados = new ArrayList<>();
		
		estados.add(new Estado("SP", 67836.43));
		estados.add(new Estado("RJ", 36678.66));
		estados.add(new Estado("MG", 29229.88));
		estados.add(new Estado("ES", 27165.48));
		estados.add(new Estado("Outros", 19849.53));

		double totalFaturamento = 0;
		for (Estado estado : estados) {
			totalFaturamento += estado.getFaturamento();
		}
		
		System.out.println("Faturamento por Estado");
		for (Estado estado : estados) {
			double valor = estado.getFaturamento();
			double percentual = estado.percentual(totalFaturamento);
			System.out.printf("%s: R$%.2f (%.2f%%)\n", estado.getNome(), valor, percentual);
					
		}
	}

}
