package agencia;

import java.util.Collection;

public class Agencia {
    Collection clientes;
    Collection pasajes;
    Collection alojamientos;
    Collection ventas;
    Collection descuentos;

    public int getVentas(int codigo){
        return codigo;
    }
    public int getCantidadVentasClientes(int dni){
        return dni;
    }
}