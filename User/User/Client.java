package User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Cardapio.Cardapio;
import Main.MainProdutos;
import Pagamentos.CartaoCredito;
import Pagamentos.Pagamento;
import Pagamentos.Pix;
import Produtos.IProduto;

public class Client extends UserType{
    public Client(){
        
    }    
    
    public Client(String nome, String endereco, int idade) {
        super(nome, endereco, idade);
    }

    @Override
    public String acessCardapio() throws IOException {
        return Cardapio.acessarCardapio();
    }
    
    // public double fazerPedido(Scanner ler){
    //     double valor = 0;
    //     ArrayList<IProduto> pedido = new ArrayList<IProduto>();
    //     while(true){
    //         IProduto produto = MainProdutos.selecionarProduto(ler);
    //         if(produto == null){
    //             break;
    //         }else{
    //             valor = valor + produto.getValorProduto();
    //             pedido.add(produto);
    //         }
    //     }
    //     return valor;
    // }

    private ArrayList<IProduto> fazerPedido(Scanner ler, ArrayList<IProduto> pedido){
        while(true){
            IProduto produto = MainProdutos.selecionarProduto(ler);
            if(produto == null){
                break;
            }else{
                pedido.add(produto);
            }
        }
        return pedido;
    }

    private double valorPedido(Scanner ler, ArrayList<IProduto> pedido){
        double valor = 0;
        for (IProduto produto : pedido) {
            valor = valor + produto.getValorProduto();
        }
        return valor;
    }

    private Boolean pagar(Scanner ler, ArrayList<IProduto> pedido){
        Pagamento pagamento = null;
        System.out.println("Selecione o meio de pagamento:");
        System.out.println("1-Cartão de crédito");
        System.out.println("2-Pix");
        int opc = ler.nextInt();

        switch(opc){
            case 1:
            pagamento = new Pagamento(new CartaoCredito());
            break;
            case 2:
            pagamento = new Pagamento(new Pix());
        }
        if(pagamento != null){
            pagamento.pagar();
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void selecionarAcao(Scanner ler) throws IOException {
        ArrayList<IProduto> pedido = new ArrayList<IProduto>();

        boolean contWhile = true;
        while(contWhile){
            System.out.println("Selecione a ação:");
            System.out.println("1-Acessar cardápio");
            System.out.println("2-Fazer pedido");
            System.out.println("3-Mostrar pedido");
            System.out.println("4-Mostrar preço total");
            System.out.println("5-Enviar pedido e pagar");
            System.out.println("0-Sair");
            int op = ler.nextInt();

            switch (op){
                case 1:
                System.out.println(acessCardapio());
                break;
                case 2:
                fazerPedido(ler, pedido);
                break;
                case 3:
                for (IProduto produto : pedido) {
                    System.out.println(produto);
                }
                break;
                case 4:
                    System.out.println(valorPedido(ler, pedido));
                break;
                case 5:
                if(pagar(ler, pedido)){
                    System.out.println("Pedido enviado e pagamento realizado");
                    contWhile = false;
                }else{
                    System.out.println("Pagamento não realizado");
                }
                case 0:
                contWhile = false;
            }
        }
    }
  
    
}