package edu.ifsp.loja.service;

import java.util.ArrayList;
import java.util.List;

import edu.ifsp.loja.controllers.produto.buscar.BuscarProdutoDTO;
import edu.ifsp.loja.controllers.produto.*;
import edu.ifsp.loja.persistencia.ProdutoDAO;


public class ProdutoService {
	
private ProdutoDAO dao = new ProdutoDAO();
	
	public List<ProdutoDTO> buscar(BuscarProdutoDTO searchDTO) {
		List<ProdutoDTO> produtos = new ArrayList<>();
		
		if (searchDTO.descricao() != null && !searchDTO.descricao().isBlank()) {
			produtos = dao.find(searchDTO.descricao()).stream()
					.map(c -> new ProdutoDTO(c.getId(), c.getDescricao(), c.getPreco()))
					.toList();
		}
		
		return produtos;
	}
}

