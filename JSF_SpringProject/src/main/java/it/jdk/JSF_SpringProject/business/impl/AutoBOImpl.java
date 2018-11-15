package it.jdk.JSF_SpringProject.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import it.jdk.JSF_SpringProject.business.AutoBO;
@Service
public class AutoBOImpl implements AutoBO {

	public List<String> getAutoInfo() {
		List<String> lista = new ArrayList<String>();
		lista.add("Audi");
		lista.add("Ferrari");
		lista.add("Fiat");
		lista.add("BMW");
		
		return lista;
	}

	public String getRivenditoreName() {
		String rivenditore = "Marco Rossi";
		return rivenditore;
	}
}
