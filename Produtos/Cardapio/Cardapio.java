package Cardapio;

import java.io.IOException;
import java.util.ArrayList;

import Produtos.Bebidas.Bebida;
import Produtos.Sanduiches.Sanduiche;

public class Cardapio {
    private Bebida[] bebidas;
    private Sanduiche[] sanduiches;
    
    public Cardapio() {
    }

    public Cardapio(Bebida[] bebidas, Sanduiche[] sanduiches) {
        this.bebidas = bebidas;
        this.sanduiches = sanduiches;
    }

    public Bebida[] getBebidas() {
        return bebidas;
    }

    public void setBebidas(Bebida[] bebidas) {
        this.bebidas = bebidas;
    }

    public Sanduiche[] getSanduiches() {
        return sanduiches;
    }

    public void setSanduiches(Sanduiche[] sanduiches) {
        this.sanduiches = sanduiches;
    }

    public static String acessarCardapio() throws IOException{
        String cardapio = "Sanduiches:\n";
        ArrayList<String> sanduiches = CardapioAcesso.getCardapioSanduiches();
        ArrayList<String> bebidas = CardapioAcesso.getCardapioBebidas();
        for (String sanduiche : sanduiches) {
            cardapio = cardapio+sanduiche+"\n";
        }
        cardapio = cardapio+"\nBebidas:\n";
        for (String bebida : bebidas) {
            cardapio = cardapio+bebida;
        }
        return cardapio;
    }

    public void mudarCardapio(ArrayList<String> bebidas, ArrayList<String> sanduiches) throws IOException{
        CardapioAcesso.setCardapioSanduiches(sanduiches);
        CardapioAcesso.setCardapioBebidas(bebidas);
    }
}
