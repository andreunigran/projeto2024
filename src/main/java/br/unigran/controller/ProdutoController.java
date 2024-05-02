package br.unigran.controller;

import br.unigran.model.Produto;

public class ProdutoController {
    
    public void salvarProduto(String nomeProduto){
        Produto produto = new Produto();
        produto.setNome(nomeProduto!=""?nomeProduto:"não informado");
        
//Dao.salva(produto);
    }
    
}
