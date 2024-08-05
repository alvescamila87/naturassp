package br.com.camila.naturassp.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.camila.naturassp.model.Categoria;
import br.com.camila.naturassp.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto, Integer>{
	
	// consulta customizada

	public ArrayList<Produto> findAllByCategoria(Categoria categoria);
	
	// public ArrayList<Produto> findAllOrderByPreco();
}
