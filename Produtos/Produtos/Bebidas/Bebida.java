package Produtos.Bebidas;

public abstract class Bebida implements IBebidas{
    private String nome;
    private double preco;
    
    public Bebida() {
        
    }
    
    public Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getValorProduto() {
        return preco;
    }

    @Override
    public void descreverBebida() {
        System.out.println("Bebida: ");
        System.out.println("    "+nome+", "+preco+";");
        
    }

    @Override
    public String toString() {
        return "Bebida: "+nome+", ";
    }
    
}
