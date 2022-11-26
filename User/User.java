import java.io.IOException;

public abstract class User {
    public String nome;
    public String endereco;
    public int idade;
    
    public Client(String nome, String endereco, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;

    }
    
    public abstract void acessCardapio() throws IOException;

}