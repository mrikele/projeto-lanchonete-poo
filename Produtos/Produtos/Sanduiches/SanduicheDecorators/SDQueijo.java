package Produtos.Sanduiches.SanduicheDecorators;

import Produtos.Sanduiches.ISanduiche;

public class SDQueijo extends SanduicheDecorator{

    public SDQueijo(ISanduiche sanduiche) {
        super(sanduiche,"Queijo",0.70);
    }
    
}
