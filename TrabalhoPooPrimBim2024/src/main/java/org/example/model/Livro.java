package org.example.model;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Livro {
    private String nome;
    private String editora;
    private ArrayList<String> autores = new ArrayList<>();
    private int anoLancamento;
    private ArrayList<String> generos = new ArrayList<>();
    private int nrPaginas;
    private int qtEstoque;
    private BigDecimal vlUnit;

    public Livro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }

    public void addAutor(String autor) {
        this.autores.add(autor);
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public ArrayList<String> getGeneros() {
        return generos;
    }

    public void setGeneros(ArrayList<String> generos) {
        this.generos = generos;
    }

    public void addGenero(String genero) {
        this.generos.add(genero);
    }

    public int getNrPaginas() {
        return nrPaginas;
    }

    public void setNrPaginas(int nrPaginas) {
        this.nrPaginas = nrPaginas;
    }

    public int getQtEstoque() {
        return qtEstoque;
    }

    public void setQtEstoque(int qtEstoque) {
        this.qtEstoque = qtEstoque;
    }

    public BigDecimal getVlUnit() {
        return vlUnit;
    }

    public void setVlUnit(BigDecimal vlUnit) {
        this.vlUnit = vlUnit;
    }

    public void adicionaEstoque(int quantidade) {
        this.qtEstoque += quantidade;
    }

    public void validaRemoveEstoque(int quantidade) throws Exception {
        if (this.qtEstoque - quantidade < 0) {
            throw new Exception("Não há estoque suficiente para o livro (" + this.nome +
                    "). Estoque atual (" + this.qtEstoque +
                    "), Quantidade a ser retirada (" + quantidade + ").");
        }
    }

    public void removeEstoque(int quantidade) throws Exception {
        validaRemoveEstoque(quantidade);
        this.qtEstoque -= quantidade;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", editora='" + editora + '\'' +
                ", autores=" + autores +
                ", anoLancamento=" + anoLancamento +
                ", generos=" + generos +
                ", nrPaginas=" + nrPaginas +
                ", qtEstoque=" + qtEstoque +
                ", vlUnit=" + vlUnit +
                '}';
    }
}
