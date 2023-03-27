public class Cliente {

    private Pagamento pagamento;
    private ComprovantePagamento comprovantePagamento;

    public Cliente (AbstractFactory fabrica) {
        this.pagamento = fabrica.createPagamento();
        this.comprovantePagamento = fabrica.createComprovantePagamento();
    }

    public String realizarPagamento() {
        return this.pagamento.pagar();
    }

    public String emitirComprovantePagamento() {
        return this.comprovantePagamento.emitir();
    }

}
