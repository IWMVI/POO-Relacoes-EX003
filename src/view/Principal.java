package view;

import java.util.ArrayList;
import java.util.List;

import model.AgendaTelefonica;
import model.Contatos;

public class Principal {
	public static void main(String[] args) {

		Contatos c1 = new Contatos("Fulano", "11999999999", "fulano@fulano.com");
		Contatos c2 = new Contatos();
		Contatos c3 = new Contatos("Cicrano", "11777777777", "cicrano@cicrano.com");

		c2.setNome("Beltrano");
		c2.setTelefone("11888888888");
		c2.setEmail("beltrano@beltrano.com");

		List<AgendaTelefonica> lista = new ArrayList<>();

		AgendaTelefonica agenda = new AgendaTelefonica();
		agenda.adicionarContato(c3);
		agenda.adicionarContato(c2);
		agenda.adicionarContato(c1);

		lista.add(agenda);

		agenda.listarContatos();
		agenda.removerContato("Fulano");
		agenda.listarContatos();

		agenda.buscarContatos("Beltrano");
		agenda.buscarContatos("Fulano");

		System.out.println("\n\nLista de contatos\n\n");
		for (AgendaTelefonica atual : lista) {
			atual.listarContatos();
		}
	}
}
