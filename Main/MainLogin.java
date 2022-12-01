package Main;

import java.io.IOException;
import java.util.Scanner;

import Login.Login;

public class MainLogin {
    public static boolean fazerLogin(Scanner ler, Login login) throws IOException{
        System.out.println("Digite o login:");
        String l = ler.nextLine();
        System.out.println("Digite a senha:");
        String s = ler.nextLine();
        return login.logar(l, s);
    }

    public static boolean cadastrarLogin(Scanner ler, Login login) throws IOException{
        System.out.println("Digite o login:");
        String l = ler.nextLine();
        System.out.println("Digite a senha:");
        String s = ler.nextLine();
        return login.cadastrar(l, s);
    }
}
