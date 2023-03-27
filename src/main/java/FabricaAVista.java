public class FabricaAVista implements AbstractFactory {

    @Override
    public Pagamento createPagamento() {
        return new PagamentoAVista();
    }

    @Override
    public ComprovantePagamento createComprovantePagamento() {
        return new ComprovantePagamentoAVista();
    }

}
