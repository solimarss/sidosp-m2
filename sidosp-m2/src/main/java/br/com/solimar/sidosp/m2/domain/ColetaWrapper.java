package br.com.solimar.sidosp.m2.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.solimar.sidosp.core.domain.Coleta;
import br.com.solimar.sidosp.core.domain.Doador;
import br.com.solimar.sidosp.core.domain.Exame;
import br.com.solimar.sidosp.core.domain.Laboratorio;



public class ColetaWrapper implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long numero;
	private Long doadorNum;
	private Long laboratorioNum;
	private Date data;
	private Date horario;
	private List<ExameWrapper> exames;
	

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Long getDoadorNum() {
		return doadorNum;
	}

	public void setDoadorNum(Long doadorNum) {
		this.doadorNum = doadorNum;
	}

	public Long getLaboratorioNum() {
		return laboratorioNum;
	}

	public void setLaboratorioNum(Long laboratorioNum) {
		this.laboratorioNum = laboratorioNum;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public List<ExameWrapper> getExames() {
		return exames;
	}

	public void setExames(List<ExameWrapper> exames) {
		this.exames = exames;
	}

	public Coleta getColeta(){
		Coleta coleta = new Coleta();
		coleta.setDoador(new Doador(doadorNum));
		coleta.setHorario(horario);
		coleta.setLaboratorio(new Laboratorio(laboratorioNum));
		coleta.setNumero(numero);
		coleta.setData(data);
		
		List<Exame> exameList = new ArrayList<Exame>();
		for (ExameWrapper exameWrapper : exames) {
			exameList.add(exameWrapper.getExame());
		}	
		coleta.setExames(exameList);
		
		return coleta;
	}

	
}
