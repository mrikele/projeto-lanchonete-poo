public class Employee extends User {
    public String nome;
    public String endereco;
    public int idade;
        
    
    public Employee(String nome, String endereco, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }

    @Override
    protected void acessarCardapio(){}
        // TODO Auto-generated method stub

    public void adicionarProduto(){}
        
    public void removerProduto(){}
    
    public void verificaPedido(){}
    
    
}