package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AgendaTelefonica {

	private List<Contatos> contatos;
	private String nome;

	public AgendaTelefonica() {
		this.contatos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void adicionarContato(Contatos contato) {
		if (contato != null) {
			contatos.add(contato);
		}
	}

	public Contatos buscarContatos(String nome) {
		for (Contatos contato : contatos) {
			if (contato.getNome().equals(nome)) {
				return contato;
			}
		}
		return null;
	}

	public void removerContato(String nome) {
		Iterator<Contatos> iterator = contatos.iterator();
		while (iterator.hasNext()) {
			Contatos contato = iterator.next();
			if (contato.getNome().equals(nome)) {
				iterator.remove();
			}
		}
	}

	public void listarContatos() {
		for (Contatos atual : contatos) {
			System.out.println(atual.getNome());
			System.out.println(atual.getTelefone());
			System.out.println(atual.getEmail());
			System.out.println();
		}
	}
}
