package Produtos.Bebidas.SucoDecorators;

import Produtos.Bebidas.IBebidas;

public class SDAdocante extends SucoDecorator{

    public SDAdocante(IBebidas bebida) {
        super(bebida, "Adocante", 0.05);
    }
    
}
