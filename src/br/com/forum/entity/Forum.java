package br.com.forum.entity;

import java.io.Serializable;
import java.util.Set;

public class Forum implements Serializable{

	private static final long serialVersionUID = 1L;
	private int idForum;
	private String assunto;
	private String descricao;
	private Set<Usuario> usuarios;
	
	public int getidForum() {
		return idForum;
	}
	public void setidForum(int idForum) {
		this.idForum = idForum;
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
