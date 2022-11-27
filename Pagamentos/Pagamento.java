package Pagamentos;

public class Pagamento {
    private IPagamento metodoPagamento;

    public Pagamento(IPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void setPagamento(IPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar() {
        metodoPagamento.pagar();
    }
}
