package Produtos.Sanduiches.SanduicheDecorators;

import Produtos.Sanduiches.ISanduiche;

public class SDAlface extends SanduicheDecorator{

    public SDAlface(ISanduiche sanduiche) {
        super(sanduiche, "Alface",0.50);

    }
    
}
