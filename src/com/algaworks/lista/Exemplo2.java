package com.algaworks.lista;

import java.util.ArrayList;
import java.util.List;

public class Exemplo2 {
	public static void main (String[] args) {
		List<Cliente> clientes = new ArrayList<>();
		
		clientes.add(new Cliente(1L, "José"));
		clientes.add(new Cliente(2L, "João"));
		clientes.add(new Cliente(3L, "Maria"));
		
		clientes.forEach(cliente -> System.out.printf("ID: %d, Nome: %s%n",
				cliente.getId(), cliente.getNome()));
	}

}
