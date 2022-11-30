package Produtos.Bebidas.SucoDecorators;

import Produtos.Bebidas.IBebidas;

public class SDAcucar extends SucoDecorator{

    public SDAcucar(IBebidas bebida) {
        super(bebida, "Acucar", 0.05);
    }
    
}
