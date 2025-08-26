package br.mack;
public class Principal {
    public static void main(String args[]) {


        CadastroProdutos cadastro = new CadastroProdutos();


        // Testes
        cadastro.adicionarProduto("Celular", 9500.0, 17); // Ok
        cadastro.adicionarProduto("", 249.99, 15); // Nome inválido
        cadastro.adicionarProduto("Fone Bluetooth", -55.90, 20); // Preço inválido
        cadastro.adicionarProduto("Teclado", 150.0, -3); // Quantidade inválida



        cadastro.listarProdutos();
    }

}
