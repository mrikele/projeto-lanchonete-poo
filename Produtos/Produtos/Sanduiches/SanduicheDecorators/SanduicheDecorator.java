package Produtos.Sanduiches.SanduicheDecorators;

import Produtos.Sanduiches.ISanduiche;

public abstract class SanduicheDecorator implements ISanduiche{
    
    protected ISanduiche sanduiche;
    protected String descricao;
    protected double preco;

    public SanduicheDecorator(ISanduiche sanduiche) {
        this.sanduiche = sanduiche;
    }

    public SanduicheDecorator(ISanduiche sanduiche, String descricao, double preco) {
        this.sanduiche = sanduiche;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    @Override
    public void descreverSanduiche() {
        System.out.println("    "+descricao+", "+preco+";");
    }

    @Override
    public double getValorProduto() {
        return preco+sanduiche.getValorProduto();
    }

    @Override
    public String toString() {
        return sanduiche.toString()+descricao+", ";
    }
    
}
