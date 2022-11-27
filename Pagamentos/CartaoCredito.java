package Pagamentos;


public class CartaoCredito implements IPagamento {
    @Override
    public void pagar() {
        System.out.println("Pagamento com cartão de crédito");
    }
}
