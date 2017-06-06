package negocio;

import java.util.ArrayList;

public interface Agenda {
	public void insereContato(Contato contato);
	public boolean procuraContato(Contato contato);
	public String procuraTelefonePorNome(String nome);
	public String listaNomesEmOrdemAlfabetica();
	public void carregaAgenda();
	public void salvaAgenda();
	public ArrayList<Contato> getAgenda();
}
