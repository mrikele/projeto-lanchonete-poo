package Produtos.Bebidas.SucoDecorators;

import Produtos.Bebidas.IBebidas;

public abstract class SucoDecorator implements IBebidas{
    protected IBebidas bebida;
    protected String descricao;
    protected double preco;
    
    public SucoDecorator(IBebidas bebida) {
        this.bebida = bebida;
    }

    public SucoDecorator(IBebidas bebida, String descricao, double preco) {
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
