package org.example.model;

import java.math.BigDecimal;

public class ItemVenda {
    private Livro livro;
    private int qtVenda;
    private BigDecimal vlDescontoUnit;
    private BigDecimal vlTotal;

    public ItemVenda() {
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getQtVenda() {
        return qtVenda;
    }

    public void setQtVenda(int qtVenda) {
        this.qtVenda = qtVenda;
    }

    public BigDecimal getVlDescontoUnit() {
        return vlDescontoUnit;
    }

    public void setVlDescontoUnit(BigDecimal vlDescontoUnit) {
        this.vlDescontoUnit = vlDescontoUnit;
    }

    public BigDecimal getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(BigDecimal vlTotal) {
        this.vlTotal = vlTotal;
    }

    public void calculaVlTotal() {
        this.vlTotal = this.livro.getVlUnit().subtract(this.vlDescontoUnit).multiply(BigDecimal.valueOf(this.qtVenda));
    }

    @Override
    public String toString() {
        return "ItemVenda{" +
                "livro=" + livro +
                ", qtVenda=" + qtVenda +
                ", vlDescontoUnit=" + vlDescontoUnit +
                ", vlTotal=" + vlTotal +
                '}';
    }
}
