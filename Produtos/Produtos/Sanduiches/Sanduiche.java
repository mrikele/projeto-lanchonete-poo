package Produtos.Sanduiches;

public class Sanduiche implements ISanduiche{
    private double precoPao;

    public Sanduiche() {
        this.precoPao = 2.00;
    }

    @Override
    public double getValorProduto() {
        return precoPao;
    }

    @Override
    public void descreverSanduiche() {
        System.out.println("Sanduiche: ");
        System.out.println("    Pão, "+precoPao+";");
    }

    @Override
    public String toString() {
        return "Sanduiche: pão, ";
    }
    
}
