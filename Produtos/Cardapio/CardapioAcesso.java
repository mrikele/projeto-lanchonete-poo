package Cardapio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CardapioAcesso {
    private static CardapioAcesso cardapioAcesso;
    private static File bebidasFile;
    private static File sanduichesFile;

    public CardapioAcesso() {
        CardapioAcesso.bebidasFile = new File("Bebidas.txt");
        CardapioAcesso.sanduichesFile = new File("Sanduiches.txt");
        if(!bebidasFile.exists()){
            try {
                bebidasFile.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(!sanduichesFile.exists()){
            try {
                sanduichesFile.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static synchronized CardapioAcesso getCardapioAcesso() {
        if(cardapioAcesso == null){
            cardapioAcesso = new CardapioAcesso();
        }
        return cardapioAcesso;
    }

    public static synchronized ArrayList<String> getCardapioBebidas() throws IOException{
        FileReader fr = new FileReader(CardapioAcesso.bebidasFile);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> bebidas = new ArrayList<String>();
        while(br.ready()){
            String linha = br.readLine();
            bebidas.add(linha);
        }
        fr.close();
        br.close();
        return bebidas;
    }

    public static synchronized ArrayList<String> getCardapioSanduiches() throws IOException{
        FileReader fr = new FileReader(CardapioAcesso.sanduichesFile);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> sanduiches = new ArrayList<String>();
        while(br.ready()){
            String linha = br.readLine();
            sanduiches.add(linha);
        }
        fr.close();
        br.close();
        return sanduiches;
    }

    public static synchronized void setCardapioBebidas(ArrayList<String> bebidas) throws IOException{
        FileWriter fw = new FileWriter(CardapioAcesso.bebidasFile, true);
        BufferedWriter bw = new BufferedWriter(fw);
        for (String bebida : bebidas) {
            bw.write(bebida);
            bw.newLine();
        }
        
        fw.close();
        bw.close();
    }

    public static synchronized void setCardapioSanduiches(ArrayList<String> sanduiches) throws IOException{
        FileWriter fw = new FileWriter(CardapioAcesso.sanduichesFile, false);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("");
        fw.close();
        bw.close();
        fw = new FileWriter(CardapioAcesso.sanduichesFile, true);
        bw = new BufferedWriter(fw);
        for (String sanduiche : sanduiches) {
            bw.write(sanduiche);
            bw.newLine();
        }
        
        fw.close();
        bw.close();
    }
}
