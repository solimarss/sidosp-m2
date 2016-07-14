package br.com.solimar.sidosp.m2.domain;

import java.io.Serializable;

import br.com.solimar.sidosp.core.domain.Exame;

public class ExameWrapper implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long codigo;
	private String nome;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Exame getExame() {
		Exame exame = new Exame();
		exame.setCodigo(codigo);
		exame.setNome(nome);
		return exame;
	}

}
