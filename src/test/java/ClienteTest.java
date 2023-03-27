import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    @Test
    void deveConsultarPagamentoAVista() {
        AbstractFactory fabrica = new FabricaAVista();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Pagamento à vista", cliente.realizarPagamento());
    }

    @Test
    void deveConsultarPagamentoAPrazo() {
        AbstractFactory fabrica = new FabricaAPrazo();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Pagamento a prazo", cliente.realizarPagamento());
    }

    @Test
    void deveEmitirComprovantePagamentoAVista() {
        AbstractFactory fabrica = new FabricaAVista();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Comprovante de pagamento à vista", cliente.emitirComprovantePagamento());
    }

    @Test
    void deveEmitirComprovantePagamentoAPrazo() {
        AbstractFactory fabrica = new FabricaAPrazo();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Comprovante de pagamento a prazo", cliente.emitirComprovantePagamento());
    }

}
