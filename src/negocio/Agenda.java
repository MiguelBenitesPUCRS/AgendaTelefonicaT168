package negocio;

import java.util.ArrayList;

public class Agenda {

	private Contato contato;
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
		
		return "";
	}
	
	public void carregaAgenda(){
		
	}
	
	public void salvaAgenda(){
		
	}

//    implemente uma agenda telefônica, que permite:
//        armazenar um nome e seu telefone;
//        recuperar um telefone, a partir do nome;
//        listar todos os nomes da agenda, em ordem alfabética;
//        recuperar os dados armazenados em um arquivo texto ao iniciar o programa;
//        salvar os dados da agenda ao encerrar o programa.
//    organize a aplicação usando os padrões citados, conforme apropriado. Use os exemplos fornecidos no moodle como orientação.

	
}
