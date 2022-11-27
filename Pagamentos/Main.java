package Pagamentos;

public class Main {
    public static void main(String[] args) {
        Pix pix = new Pix();
        Pagamento pagamento = new Pagamento(pix);
        pagamento.pagar();
    } 
}
