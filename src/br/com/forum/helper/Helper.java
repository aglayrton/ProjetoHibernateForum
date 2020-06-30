package br.com.forum.helper;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.forum.config.HibernateUtil;
import br.com.forum.entity.Forum;
import br.com.forum.entity.Usuario;

public class Helper {
	Session session = null;
	Transaction transaction = null;
	
	//Aqui é salvo os dados de um forum
	public String salvar(Forum forum) {
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.save(forum);
			transaction.commit();
			return "Forum salvo";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	
	public String salvar(Usuario forum) {
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.save(forum);
			transaction.commit();
			return "ok";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	//#################################################################################
	//Adiciona o usuario para o forum
	public String adicionarUsuario(int idForum, int idUsuario) {
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			
			Forum f = (Forum) session.load(Forum.class, idForum);
			Usuario u = (Usuario) session.load(Usuario.class, idUsuario);
			
			f.getUsuarios().add(u);
			session.save(f);
			transaction.commit();
			return "Associação realizada";
		} catch (Exception e) {
			return e.getLocalizedMessage();
		}
	}
	
	public String adicionarUsuario(int idForum, Usuario usuario) {
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			
			Forum f = (Forum) session.load(Forum.class, idForum);
			usuario.setForum(f);
			
			f.getUsuarios().add(usuario);
			session.update(f);
			transaction.commit();
			return "Inclusão realizada";
		} catch (Exception e) {
			return e.getLocalizedMessage();
		}
	}
	
	public Set<Usuario> listarUsuariosById(int idForum){
		Set<Usuario> usuarios = new HashSet<Usuario>();
		try {
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		transaction = session.beginTransaction();
		Forum f = (Forum)session.load(Forum.class, idForum);
		usuarios = f.getUsuarios();
		} catch (Exception e) {
			e.getMessage();
		}
		return usuarios;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
