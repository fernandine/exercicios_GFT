package aplicacao;

import entidade.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Jean");
		System.out.println("Meu nome �: " + pessoa.getNome());
		pessoa.setEndereco("Nova Lima");
		System.out.println("Endere�o: " + pessoa.getEndereco());
		pessoa.setTelefone(938564787);
		System.out.println("Telefone: " + pessoa.getTelefone());

	}

}
