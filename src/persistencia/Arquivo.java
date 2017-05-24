package persistencia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import negocio.Contato;

public class Arquivo {
	
	public void GravaAgenda(ArrayList agenda) throws IOException {
		Contato contato;
		FileWriter arquivo = new FileWriter("agenda.txt");
	    PrintWriter gravaAgenda = new PrintWriter(arquivo);
		
		for(int i=0;i<agenda.size();i++){
			contato = (Contato) agenda.get(i);
			gravaAgenda.println(contato.getNome()+";"+contato.getTelefone());
		}
		arquivo.flush();
		arquivo.close();
	}

	public ArrayList<Contato> LerAgenda() throws IOException{
		ArrayList<Contato> retorno = new ArrayList<>();
		FileReader arquivo = new FileReader("agenda.txt");
		BufferedReader leitura = new BufferedReader(arquivo);
		
		String linha = leitura.readLine();	
		while(linha !=null){
			String[] dados = linha.split(";");
			Contato contato = new Contato(dados[0],dados[1]);
			retorno.add(contato);
			linha = leitura.readLine();
		}
		return retorno;
	}
	
}
