public class Client extends User{
        
    
    public Client(String nome, String endereco, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;

    }

    @Override
    protected void acessarCardapio() {}
    
    public void fazerPedido(){}
    
    public void pagar(){}
    
}