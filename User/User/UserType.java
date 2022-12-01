package User;
import java.io.IOException;
import java.util.Scanner;

import Produtos.IProduto;

public abstract class UserType {
    private String nome;
    private String endereco;
    private int idade;
    
    public UserType(){
        
    }

    public UserType(String nome, String endereco, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;

    }
    
    public abstract String acessCardapio() throws IOException;
    public abstract void selecionarAcao(Scanner ler) throws IOException;
}