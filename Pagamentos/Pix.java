package Pagamentos;

public class Pix implements IPagamento{
    @Override
    public void pagar() {
        System.out.println("Pagamento com Pix");
    }
}