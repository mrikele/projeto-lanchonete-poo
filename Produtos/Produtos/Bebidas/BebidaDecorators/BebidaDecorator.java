package Produtos.Bebidas.BebidaDecorators;

import Produtos.Bebidas.IBebidas;

public abstract class BebidaDecorator implements IBebidas{
    protected IBebidas bebida;
    protected String descricao;
    protected double preco;
    
    public BebidaDecorator(IBebidas bebida) {
        this.bebida = bebida;
    }

    public BebidaDecorator(IBebidas bebida, String descricao, double preco) {
        this.bebida = bebida;
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public void descreverBebida() {
        System.out.println("    "+descricao+", "+preco+";");
        
    }

    @Override
    public double getValorProduto() {
        return preco+bebida.getValorProduto();
    }

    @Override
    public String toString() {
        return bebida.toString()+descricao+", ";
    }
    
}
