package Produtos.Bebidas.BebidaDecorators;

import Produtos.Bebidas.IBebidas;

public class BDGelo extends BebidaDecorator{

    public BDGelo(IBebidas bebida) {
        super(bebida, "Gelo", 0.05);
    }
    
}
