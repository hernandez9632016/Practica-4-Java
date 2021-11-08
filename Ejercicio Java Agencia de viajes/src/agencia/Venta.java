package agencia;

import java.util.Collection;

public class Venta {
    int num;
    Collection items;
    Cliente cliente;
    float total;

    public float getTotal(Collection descuentos) {
        return total;
    }

    public boolean validarDestino(String destino) {
        return true;
    }

    public void confirmarVenta() {

    }
}