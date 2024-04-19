package org.example;

import org.example.model.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        Livro livro1 = new Livro();
        livro1.setNome("Harry Potter e a Pedra Filosofal");
        livro1.setEditora("Rocco");
        livro1.addAutor("J.K. Rowling");
        livro1.setAnoLancamento(1997);
        livro1.addGenero("Aventura");
        livro1.addGenero("Fantasia");
        livro1.setNrPaginas(208);
        livro1.setQtEstoque(300);
        livro1.setVlUnit(new BigDecimal("50.00"));

        Livro livro2 = new Livro();
        livro2.setNome("Harry Potter e a Câmara Secreta");
        livro2.setEditora("Rocco");
        livro2.addAutor("J.K. Rowling");
        livro2.setAnoLancamento(1998);
        livro2.addGenero("Aventura");
        livro2.addGenero("Fantasia");
        livro2.setNrPaginas(224);
        livro2.setQtEstoque(389);
        livro2.setVlUnit(new BigDecimal("59.00"));

        Livro livro3 = new Livro();
        livro3.setNome("Harry Potter e o Prisioneiro de Azkaban");
        livro3.setEditora("Rocco");
        livro3.addAutor("J.K. Rowling");
        livro3.setAnoLancamento(1999);
        livro3.addGenero("Aventura");
        livro3.addGenero("Fantasia");
        livro3.setNrPaginas(348);
        livro3.setQtEstoque(389);
        livro3.setVlUnit(new BigDecimal("70.97"));

        Endereco ender1 = new Endereco();
        ender1.setLogradouro("Av. Tiradentes");
        ender1.setNumero("1165");
        ender1.setCep("85900-230");
        ender1.setBairro("Centro");
        ender1.setMunicipio("Toledo");
        ender1.setUf("PR");
        ender1.setPais("Brasil");

        Endereco ender2 = new Endereco();
        ender2.setLogradouro("Av. Maripá");
        ender2.setNumero("5267");
        ender2.setCep("85901-270");
        ender2.setBairro("Centro");
        ender2.setMunicipio("Toledo");
        ender2.setUf("PR");
        ender2.setPais("Brasil");

        Cliente cliente = new Cliente();
        cliente.setNmCliente("Oscar Silva");
        cliente.addEndereco(ender1);
        cliente.addEndereco(ender2);
        cliente.addTelefone("(45) 3196-2495");

        ItemVenda itemVenda1 = new ItemVenda();
        itemVenda1.setLivro(livro1);
        itemVenda1.setQtVenda(1);
        itemVenda1.setVlDescontoUnit(new BigDecimal("2.0"));
        itemVenda1.calculaVlTotal();

        ItemVenda itemVenda2 = new ItemVenda();
        itemVenda2.setLivro(livro2);
        itemVenda2.setQtVenda(1);
        itemVenda2.setVlDescontoUnit(new BigDecimal("1.8"));
        itemVenda2.calculaVlTotal();

        ItemVenda itemVenda3 = new ItemVenda();
        itemVenda3.setLivro(livro3);
        itemVenda3.setQtVenda(1);
        itemVenda3.setVlDescontoUnit(new BigDecimal("2.25"));
        itemVenda3.calculaVlTotal();

        Pagamento pagto1 = new Pagamento();
        pagto1.setFormaPagto(Pagamento.FormaPagto.DINHEIRO);
        pagto1.setValor(new BigDecimal("70.50"));

        Pagamento pagto2 = new Pagamento();
        pagto2.setFormaPagto(Pagamento.FormaPagto.DEBITO);
        pagto2.setValor(new BigDecimal("103.42"));

        Venda venda = new Venda();
        venda.setCliente(cliente);
        venda.addItem(itemVenda1);
        venda.addItem(itemVenda2);
        venda.addItem(itemVenda3);
        venda.addPagamento(pagto1);
        venda.addPagamento(pagto2);

        venda.efetua();

        System.out.println(venda);
    }
}