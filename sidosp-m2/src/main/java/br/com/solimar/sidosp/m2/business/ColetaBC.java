package br.com.solimar.sidosp.m2.business;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import br.com.solimar.sidosp.m2.domain.Coleta;

@ApplicationScoped

public class ColetaBC {
	
	//simula o banco de dados
	private List<Coleta> dataBase = new ArrayList<Coleta>();
	
	
	public void insert(Coleta coleta) {
		
		dataBase.add(coleta);
		
	}
	
	public Coleta find(Long num) {
		for (Coleta coleta : dataBase) {
			if(num.equals(coleta.getNumero())){
				return coleta;
			}
		}
		return null;
	}

}
