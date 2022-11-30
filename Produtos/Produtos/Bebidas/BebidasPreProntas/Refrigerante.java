package Produtos.Bebidas.BebidasPreProntas;

import Produtos.Bebidas.IBebidas;

public abstract class Refrigerante implements IBebidas{
    private String nome;
    private double preco;

    public Refrigerante(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public double getValorProduto() {
        return preco;
    }

    @Override
    public void descreverBebida() {
        System.out.println("    "+nome+", "+preco+";");
        
    }

    
}
