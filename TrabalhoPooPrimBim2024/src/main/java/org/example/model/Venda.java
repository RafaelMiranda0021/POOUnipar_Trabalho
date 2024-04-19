package org.example.model;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.example.model.Formata.real;

public class Venda {
    private Cliente cliente;
    private ArrayList<ItemVenda> itens = new ArrayList<>();
    private BigDecimal vlTotal;
    private ArrayList<Pagamento> pagamentos = new ArrayList<>();

    public Venda() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }

    public void addItem(ItemVenda item) {
        this.itens.add(item);
    }

    public BigDecimal getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(BigDecimal vlTotal) {
        this.vlTotal = vlTotal;
    }

    public void calculaVlTotal() {
        this.vlTotal = BigDecimal.ZERO;
        for (ItemVenda item : this.itens) {
            item.calculaVlTotal();
            this.vlTotal = this.vlTotal.add(item.getVlTotal());
        }
    }

    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(ArrayList<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public void addPagamento(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
    }

    public void efetua() throws Exception {
        for (ItemVenda item : this.itens) {
            item.getLivro().validaRemoveEstoque(item.getQtVenda());
        }

        BigDecimal vlPagto = BigDecimal.ZERO;

        for (Pagamento pagto : this.pagamentos) {
            vlPagto = vlPagto.add(pagto.getValor());
        }

        this.calculaVlTotal();

        if (vlPagto.compareTo(this.vlTotal) != 0) {
            throw new Exception("Valor do pagamento (" + real(vlPagto) +
                                ") é diferente do valor total da venda (" + real(this.vlTotal) +
                                "). Diferença: (" + real(vlPagto.subtract(this.vlTotal).abs()) + ").");
        }

        for (ItemVenda item : this.itens) {
            item.getLivro().removeEstoque(item.getQtVenda());
        }
    }

    @Override
    public String toString() {
        return "Venda{" +
                "cliente=" + cliente +
                ", itens=" + itens +
                ", vlTotal=" + vlTotal +
                ", pagamentos=" + pagamentos +
                '}';
    }
}
