package User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Cardapio.Cardapio;

public class Employee extends UserType {
    public Employee(){
        
    }
    
    public Employee(String nome, String endereco, int idade) {
        super(nome, endereco, idade);
    }

    @Override
    public String acessCardapio() throws IOException {
        return Cardapio.acessarCardapio();
    }    
    public void mudarCardapio(ArrayList<String> bebida, ArrayList<String> sanduiche) throws IOException{
        Cardapio.mudarCardapio(bebida, sanduiche); // parametros
    }

    @Override
    public void selecionarAcao(Scanner ler) throws IOException {
        System.out.println("Selecione a ação:");
        System.out.println("1-Acessar cardápio");
        // System.out.println("2-Mudar cardápio");
        System.out.println("0-Sair");
        int op = ler.nextInt();

        switch (op){
            case 1:
            System.out.println(acessCardapio());
            break;
            // case 2:
            // return mudarCardapio(null, null);
            case 0:
        }
        
    }

    
}