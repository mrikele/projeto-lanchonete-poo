package Main;

import java.io.IOException;
import java.util.Scanner;
import Cardapio.Cardapio;
import Login.Login;
import User.Client;
import User.User;

public class Main {

    public static void main(String[] args) throws IOException {
        Cardapio cardapio = new Cardapio();
        Scanner ler = new Scanner(System.in);
        Login login = Login.getInstancia();

        User user = null;

        boolean contWhile = true;
        System.out.println("Selecione uma ação:");
        System.out.println("1-Fazer login");
        System.out.println("2-Cadastrar");
        int opc = ler.nextInt();
        switch(opc){
            case 1:
            MainLogin.fazerLogin(ler, login);
            break;
            case 2:
            MainLogin.cadastrarLogin(ler, login);
            break;
        }
        user = new User(new Client());
        user.selecionarAcao(ler);

    }
}
