package Produtos.Bebidas.Suco;

public class SucoDeLaranja extends Suco{

    public SucoDeLaranja() {
        super("Suco de Laranja", 2.00);
    }

    @Override
    protected void preparar() {
        espremerLaranja();
        System.out.println("Mistura água com laranja");
        
    }

    private void espremerLaranja(){
        System.out.println("Espreme laranja");
    }
    
}
