package Produtos.Bebidas.Suco;

import Produtos.Bebidas.IBebidas;

public abstract class Suco implements IBebidas{
    private String nome;
    private double preco;
    
    public Suco(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        pegarAgua();
        preparar();
        entregar();
    }

    public void pegarAgua(){
        System.out.println("Pegar água gelada");
    }

    protected abstract void preparar();

    public void entregar(){
        System.out.println("Entregar suco");
    }

    @Override
    public double getValorProduto() {
        return preco;
    }

    @Override
    public void descreverBebida() {
        System.out.println("Suco: ");
        System.out.println("    "+nome+", "+preco+";");
        
    }

    @Override
    public String toString() {
        return "Suco: "+nome+", ";
    }
    
}
