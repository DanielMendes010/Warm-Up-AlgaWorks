/* Lista da API de Collections e Lambda Expression */

package com.algaworks.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Exemplo1 {
	
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		
		nomes.add("José");
		nomes.add("Maria");
		nomes.add("João");
		
		//nomes.remove(1);
		//nomes.remove("José");
		
		//System.out.println(nomes);
		
//		for (int i = 0; i < nomes.size(); i ++) {
//			System.out.println("Nome: " + nomes.get(i));
//		}
		
//		for (String nome : nomes) {
//			System.out.println("Nome: " + nome);
//		}
		
//		nomes.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//				
//			}
//		});
		
//		nomes.forEach(nome -> {
//			System.out.println(nome);
//		});
		
//		nomes.forEach(nome -> System.out.println(nome));
		
		nomes.forEach(System.out::println);
	}

}
