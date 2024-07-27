package services;

import java.util.ArrayList;

import model.Categoria;

public interface ICategoriaService {
	
	/**
	 * Esse método recebe uma cateogira só com o nome preenchido e 
	 * insere no banco de dados
	 * @param categoria 
	 * @return
	 */
	public Categoria inserirNovaCategoria(Categoria categoria);
	
	/**
	 * Esse método vai alterar a categoria existente e retorná-la se o update deu certo
	 * e null caso contrário
	 * @param categoria
	 * @return
	 */
	public Categoria alterarCategoria(Categoria categoria);
	
	/**
	 * Esse método recupera todas as categorias cadastradas sem filtro
	 * @return
	 */
	public ArrayList<Categoria> recuperarTodasCategorias();
	
	/**
	 * Esse método recupera todas as categorias cadastradas por palavra-chave
	 * @param palavraChave
	 * @return
	 */
	public ArrayList<Categoria> recuperarPorPalavraChave(String palavraChave);

}
