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
    private static File sucosFile;
    private static File sanduichesFile;

    public CardapioAcesso() {
        CardapioAcesso.sucosFile = new File("sucos.txt");
        CardapioAcesso.sanduichesFile = new File("Sanduiches.txt");
        if(!sucosFile.exists()){
            try {
                sucosFile.createNewFile();
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

    public static synchronized ArrayList<String> getCardapioSucos() throws IOException{
        FileReader fr = new FileReader(CardapioAcesso.sucosFile);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> sucos = new ArrayList<String>();
        while(br.ready()){
            String linha = br.readLine();
            sucos.add(linha);
        }
        fr.close();
        br.close();
        return sucos;
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

    public static synchronized void setCardapioSucos(ArrayList<String> sucos) throws IOException{
        FileWriter fw = new FileWriter(CardapioAcesso.sucosFile, true);
        BufferedWriter bw = new BufferedWriter(fw);
        for (String suco : sucos) {
            bw.write(suco);
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
