package negocio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class Agenda {

	private Contato contato;
	private AgendaPorNome comparador  = new AgendaPorNome();
	
	private ArrayList agenda;
	
	public Agenda(){
		agenda = new ArrayList<Contato>();
	}
	
	public void insereContato(Contato contato){
		agenda.add(contato);
	}
	
	public boolean procuraContato(Contato contato){
		for(int i =0;i<agenda.size();i++){
			if(agenda.get(i).equals(contato)){
				return true;
			}
		}		
		return false;
	}
	
	public String procuraTelefonePorNome(String nome){
		String telefone;
		Contato contato;
		for(int i=0;i<agenda.size();i++){
			contato = (Contato) agenda.get(i);
			if (contato.getNome().equals(nome)){
				telefone = contato.getTelefone();
				return telefone;
			}	
		}
		return "";
	}
	
	
	public String listaNomesEmOrdemAlfabetica(){
		String retorno="";
		Contato contato;
		Collections.sort(agenda, comparador);
		
		for(int i=0;i<agenda.size();i++){
			contato = (Contato) agenda.get(i);
			retorno = retorno + contato.getNome()+"\n";
		}
		return retorno;
	}
	
	public void carregaAgenda(){
		
	}
	
	public void salvaAgenda(){
		
	}
	
	public ArrayList<Contato> getAgenda(){
		return agenda;
	}

	

//    implemente uma agenda telef�nica, que permite:
//        armazenar um nome e seu telefone;
//        recuperar um telefone, a partir do nome;
//        listar todos os nomes da agenda, em ordem alfab�tica;
//        recuperar os dados armazenados em um arquivo texto ao iniciar o programa;
//        salvar os dados da agenda ao encerrar o programa.
//    organize a aplica��o usando os padr�es citados, conforme apropriado. Use os exemplos fornecidos no moodle como orienta��o.

	
}
