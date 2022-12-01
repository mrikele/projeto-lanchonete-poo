package User;

import java.io.IOException;
import java.util.Scanner;

public class User {
    private UserType user;

    public User(UserType user) {
        this.user = user;
    }

    public void selecionarAcao(Scanner ler) throws IOException{
        user.selecionarAcao(ler);
    }
}
