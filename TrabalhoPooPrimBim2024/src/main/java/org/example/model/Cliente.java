package org.example.model;

import java.util.ArrayList;

public class Cliente {
    private String nmCliente;
    private ArrayList<Endereco> enderecos = new ArrayList<>();
    private ArrayList<String> telefones = new ArrayList<>();

    public Cliente() {
    }

    public String getNmCliente() {
        return nmCliente;
    }

    public void setNmCliente(String nmCliente) {
        this.nmCliente = nmCliente;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void addEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    public ArrayList<String> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<String> telefones) {
        this.telefones = telefones;
    }

    public void addTelefone(String telefone) {
        this.telefones.add(telefone);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nmCliente='" + nmCliente + '\'' +
                ", enderecos=" + enderecos +
                ", telefones=" + telefones +
                '}';
    }
}
