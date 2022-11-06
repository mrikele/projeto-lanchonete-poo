package Produtos.Bebidas.BebidaDecorators;

import Produtos.Bebidas.IBebidas;

public class BDAcucar extends BebidaDecorator{

    public BDAcucar(IBebidas bebida) {
        super(bebida, "Acucar", 0.05);
    }
    
}
