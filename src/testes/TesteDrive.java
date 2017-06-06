package testes;

import java.io.IOException;
import java.util.ArrayList;

import negocio.AgendaContatos;
import negocio.Contato;
import persistencia.Arquivo;

public class TesteDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Contato c0 = new Contato("Evandro", "3411-3500");
		Contato c1 = new Contato("Temis", "3011-3500");
		Contato c2 = new Contato("Miguel", "99137-5375");
		Contato c3 = new Contato("Ana", "91824233");
		
		AgendaContatos a = new AgendaContatos();
		Arquivo ar = new Arquivo();
		
		a.insereContato(c0);
		a.insereContato(c1);
		a.insereContato(c2);
		a.insereContato(c3);
		
		System.out.println("Telefone de Temis : "+a.procuraTelefonePorNome("Temis"));
		System.out.println("Telefone de Miguel: "+a.procuraTelefonePorNome("Miguel"));
		System.out.println(a.listaNomesEmOrdemAlfabetica());
		ar.GravaAgenda(a.getAgenda());
		
		
		ArrayList<Contato> agendaRetorno = new ArrayList<Contato>();
		agendaRetorno = ar.LerAgenda();
		
		Contato cnew;
		
		for(int i=0;i<agendaRetorno.size();i++){
			cnew = agendaRetorno.get(i);
			
			System.out.println(cnew.getNome()+";"+cnew.getTelefone());
		}
		
		
		
	}

}
