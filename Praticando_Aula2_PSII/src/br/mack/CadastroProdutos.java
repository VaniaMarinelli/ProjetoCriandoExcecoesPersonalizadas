package br.mack;

import br.mack.exceptions.NomeInvalidoException;
import br.mack.exceptions.PrecoInvalidoException;
import br.mack.exceptions.QuantidadeInvalidaException;

import java.util.ArrayList;
import java.util.List;

public class CadastroProdutos {
    private List<Produto> produtos;


    public CadastroProdutos() {
        produtos = new ArrayList<>();
    }


    public void adicionarProduto(String nome, double preco, int quantidade) {
        try {
            Produto produto = new Produto(nome, preco, quantidade);
            produtos.add(produto);
            System.out.println("Produto adicionado: " + produto);
        } catch (NomeInvalidoException | PrecoInvalidoException | QuantidadeInvalidaException e){
            System.out.println("Erro ao adicionar produto: " + e.getMessage());
        }

    }


    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }
}
