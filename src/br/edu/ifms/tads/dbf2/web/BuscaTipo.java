package br.edu.ifms.tads.dbf2.web;

import java.util.ArrayList;
import java.util.List;

public class BuscaTipo {

	public static List<String> doces(){
		List<String> doces = new ArrayList<String>();
		doces.add("bolo");
		doces.add("pudim");
		doces.add("brigadeiro");
		return doces;
		
	}
	
	public static List<String> salgados(){
		List<String> salgados = new ArrayList<String>();
		salgados.add("Coxinha");
		salgados.add("Pastel");
		salgados.add("Saltenha");
		return salgados;
		
	}
	

}
