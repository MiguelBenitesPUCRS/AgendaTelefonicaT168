package negocio;

import java.util.Comparator;

public class AgendaPorNome implements Comparator<Contato>{

	@Override
	public int compare(Contato contatoA, Contato contatoB) {
		return contatoA.getNome().compareTo(contatoB.getNome());
	}

}
