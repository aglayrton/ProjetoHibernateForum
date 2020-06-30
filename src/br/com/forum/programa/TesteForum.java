package br.com.forum.programa;

import java.util.Set;

import br.com.forum.entity.Forum;
import br.com.forum.entity.Usuario;
import br.com.forum.helper.Helper;

public class TesteForum {
	public static void main(String[] args) {
		incluirForum();
		incluirUsuarioNoForum();
		listarUsuariosPorForum();
	}
	
	private static void incluirForum() {
		Forum forum = new Forum();
		forum.setidForum(10);
		forum.setAssunto("Desenvolvimento de Sistemas");
		forum.setDescricao("Usano HIBERNATE");
		
		Helper helper = new Helper();
		System.out.println(helper.salvar(forum));
	}
	
	private static void incluirUsuarioNoForum() {
		Helper helper = new Helper();
		
		Usuario u1 = new Usuario();
		u1.setIdUsuario(1);
		u1.setNome("Teresa");
		u1.setEmail("teresa@gmail.com");
		
		Usuario u2 = new Usuario();
		u2.setIdUsuario(2);
		u2.setNome("Jonas");
		u2.setEmail("jonas@gmail.com");
		
		Usuario u3 = new Usuario();
		u3.setNome("abilio");
		u3.setEmail("abilio@mail.com");
		u3.setIdUsuario(3);
		
		System.out.println(helper.adicionarUsuario(10, u1));
		System.out.println(helper.adicionarUsuario(10, u2));
		System.out.println(helper.adicionarUsuario(10, u3));
	}
	
	private static void listarUsuariosPorForum(){
		Helper helper = new Helper();
		Set<Usuario> usuarios = helper.listarUsuariosById(10);
		for(Usuario usuario: usuarios){
		System.out.println("ID Usuario: " + usuario.getIdUsuario());
		System.out.println("Nome Usuario: " + usuario.getNome());
		System.out.println("Email Usuario: "+ usuario.getEmail());
		System.out.println("--------------------------------");
		}
	}
}
