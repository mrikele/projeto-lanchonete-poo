import java.io.IOException;
import Cardapio.Cardapio;
   
public class Client extends User{
        
    
    public Client(String nome, String endereco, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;

    }

    @Override
    public void acessCardapio() throws IOException {
        Cardapio.acessarCardapio();
    }
    
    public void fazerPedido(){}
  
    
}