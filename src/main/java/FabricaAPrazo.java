public class FabricaAPrazo implements AbstractFactory {

    @Override
    public Pagamento createPagamento() {
        return new PagamentoAPrazo();
    }

    @Override
    public ComprovantePagamento createComprovantePagamento() {
        return new ComprovantePagamentoAPrazo();
    }

}
