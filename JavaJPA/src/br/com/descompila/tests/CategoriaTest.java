package br.com.descompila.tests;

import br.com.descompila.model.bean.Categoria;
import br.com.descompila.model.dao.CategoriaDAO;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import br.com.descompila.connection.*;

public class CategoriaTest {

	public static void main(String a[]) {
		
		CategoriaDAO dao = new CategoriaDAO();
		dao.remove(3);
		//for(Categoria c: dao.findAll()) {
		//	System.out.println("Descrição: "+c.getDescricao());
		//}
		
		
		
		
	}
}
