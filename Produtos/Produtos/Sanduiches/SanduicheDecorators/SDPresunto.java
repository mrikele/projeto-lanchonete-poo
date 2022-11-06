package Produtos.Sanduiches.SanduicheDecorators;

import Produtos.Sanduiches.ISanduiche;

public class SDPresunto extends SanduicheDecorator{

    public SDPresunto(ISanduiche sanduiche) {
        super(sanduiche, "Presunto", 0.80);
    }
    
}
