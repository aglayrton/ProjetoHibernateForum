package br.com.forum.entity;

import java.io.Serializable;
import java.util.Set;

public class Forum implements Serializable{

	private static final long serialVersionUID = 1L;
	private int idoforum;
	private String assunto;
	private String descricao;
	private Set<Usuario> usuarios;
	
	public int getIdoforum() {
		return idoforum;
	}
	public void setIdoforum(int idoforum) {
		this.idoforum = idoforum;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Set<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
	
}
