package br.mack;

import br.mack.exceptions.NomeInvalidoException;
import br.mack.exceptions.PrecoInvalidoException;
import br.mack.exceptions.QuantidadeInvalidaException;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;


    public Produto(String nome, double preco, int quantidade) throws NomeInvalidoException, PrecoInvalidoException, QuantidadeInvalidaException{

        if (nome == null || nome.trim().isEmpty()){
            throw new NomeInvalidoException("Coloque o nome do produto!");
        }

        if (preco <= 0 ){
            throw new PrecoInvalidoException("O preço do produto não pode ser menor ou igual a 0!");
        }

        if (quantidade < 0){
            throw new QuantidadeInvalidaException("A quantidade de produtos não pode ser negativa!");
        }

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Preço: R$" + preco + " | Quantidade: " + quantidade;
    }

}
