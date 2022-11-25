public class Employee extends User {
        
    
    public Employee(String nome, String endereco, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }

    @Override
    protected void acessarCardapio(){}
        // TODO Auto-generated method stub
    
    public void mudarCardapio(){}

    public void adicionarProduto(){}
        
    public void removerProduto(){}
    
    public void verificaPedido(){}
    
    
}