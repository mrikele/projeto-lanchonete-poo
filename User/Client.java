public class Client extends User{
        
    
    public Client(String nome, String endereco, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;

    }

    @Override
    protected void acessarCardapio() {}
        // TODO Auto-generated method stub
    
    public void fazerPedido(){}
    
    public void pagar(){}
    
}