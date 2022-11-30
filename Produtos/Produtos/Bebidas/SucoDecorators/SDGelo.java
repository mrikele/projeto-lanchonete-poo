package Produtos.Bebidas.SucoDecorators;

import Produtos.Bebidas.IBebidas;

public class SDGelo extends SucoDecorator{

    public SDGelo(IBebidas bebida) {
        super(bebida, "Gelo", 0.05);
    }
    
}
