package br.com.descompila.model.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.descompila.connection.ConnectionFactory;
import br.com.descompila.model.bean.Produto;

public class ProdutoDAO {

	public Produto save(Produto produto) {
		EntityManager em = new ConnectionFactory().getConnection();
		
		try {
			em.getTransaction().begin();
			if(produto.getId() == null) {
				em.persist(produto);
			}else {
				em.merge( produto);
			}
			em.getTransaction().commit();
		}catch(Exception e){
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		
		return produto;
	}
	public Produto findById(int id) {
		EntityManager em = new ConnectionFactory().getConnection();
		Produto produto = null;
		try {
			produto = em.find(Produto.class, id);
		}catch(Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		
		return produto;
	}
	public List<Produto> findAll(){
		EntityManager em = new ConnectionFactory().getConnection();
		List<Produto> produtos = null;
		try {
			produtos = em.createQuery("from Produto produto").getResultList();
		}catch(Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		return produtos;
		
	}
}
