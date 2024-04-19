package org.example.model;

import java.math.BigDecimal;

public class Pagamento {
    public enum FormaPagto {
        DINHEIRO,
        DEBITO,
        CREDITO,
        PIX,
        CABAL
    }

    private FormaPagto formaPagto;
    private BigDecimal valor;

    public Pagamento() {
    }

    public FormaPagto getFormaPagto() {
        return formaPagto;
    }

    public void setFormaPagto(FormaPagto formaPagto) {
        this.formaPagto = formaPagto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "formaPagto=" + formaPagto +
                ", valor=" + valor +
                '}';
    }
}
