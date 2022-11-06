package Produtos.Bebidas.BebidaDecorators;

import Produtos.Bebidas.IBebidas;

public class BDAdocante extends BebidaDecorator{

    public BDAdocante(IBebidas bebida) {
        super(bebida, "Adocante", 0.05);
    }
    
}
