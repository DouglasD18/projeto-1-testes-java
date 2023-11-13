package com.ada.teste;

import com.ada.loja.Produto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProdutoTest {

    @Test
    public void criacaoDeProdutoComParametrosValidos() {
        int cod = 123;
        String nome = "Calça";
        double preco = 50.00;

        Produto produto = new Produto(cod, nome, preco);

        Assertions.assertEquals(cod, produto.getCod());
        Assertions.assertEquals(nome, produto.getNome());
        Assertions.assertEquals(preco, produto.getPreco());
    }

    @Test
    public void alterarNomeDoProduto() {
        Produto produto = new Produto(123, "Camisa", 50.00);

        String nome = "Calça";
        produto.setNome(nome);

        Assertions.assertEquals(nome, produto.getNome());
    }

    @Test
    public void alterarPrecoDoProduto() {
        Produto produto = new Produto(123, "Camisa", 50.00);

        double novoPreco = 49.99;
        produto.setPreco(novoPreco);

        Assertions.assertEquals(novoPreco, produto.getPreco());
    }
}
