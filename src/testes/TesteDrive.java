package testes;

import negocio.Agenda;
import negocio.Contato;

public class TesteDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contato c0 = new Contato("Evandro", "3411-3500");
		Contato c1 = new Contato("Temis", "3011-3500");
		Contato c2 = new Contato("Miguel", "99137-5375");
		
		Agenda a = new Agenda();
		
		a.insereContato(c0);
		a.insereContato(c1);
		a.insereContato(c2);
		
		System.out.println("Telefone de Temis : "+a.procuraTelefonePorNome("Temis"));
		System.out.println("Telefone de Miguel: "+a.procuraTelefonePorNome("Miguel"));
		
	}

}
