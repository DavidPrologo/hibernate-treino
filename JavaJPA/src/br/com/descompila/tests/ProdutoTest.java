package br.com.descompila.tests;

import br.com.descompila.model.dao.ProdutoDAO;
import br.com.descompila.model.bean.Produto;
import br.com.descompila.model.bean.Categoria;

public class ProdutoTest {
	public static void main(String a[]) {
		
		ProdutoDAO dao = new ProdutoDAO();
		
		for(Produto p: dao.findAll()) {
			System.out.println(p.getDescricao());
		}
	}
}
