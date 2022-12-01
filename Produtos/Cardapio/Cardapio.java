package Cardapio;

import java.io.IOException;
import java.util.ArrayList;

import Produtos.Bebidas.Suco.Suco;
import Produtos.Sanduiches.Sanduiche;

public class Cardapio {
    private Suco[] sucos;
    private Sanduiche[] sanduiches;
    private CardapioAcesso cardapioAcesso;
    
    public Cardapio() {
        cardapioAcesso = CardapioAcesso.getInstance();
    }

    public Cardapio(Suco[] sucos, Sanduiche[] sanduiches) {
        cardapioAcesso = CardapioAcesso.getInstance();
        this.sucos = sucos;
        this.sanduiches = sanduiches;
    }

    public Suco[] getSucos() {
        return sucos;
    }

    public void setSucos(Suco[] sucos) {
        this.sucos = sucos;
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
        ArrayList<String> Sucos = CardapioAcesso.getCardapioSucos();
        for (String sanduiche : sanduiches) {
            cardapio = cardapio+sanduiche+"\n";
        }
        cardapio = cardapio+"\nSucos:\n";
        for (String Suco : Sucos) {
            cardapio = cardapio+Suco;
        }
        return cardapio;
    }

    public static void mudarCardapio(ArrayList<String> Sucos, ArrayList<String> sanduiches) throws IOException{
        CardapioAcesso.setCardapioSanduiches(sanduiches);
        CardapioAcesso.setCardapioSucos(Sucos);
    }
}
