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
	
}
