package agencia;

public class ItemVenta {
    int cantidad;
    String descripcion;
    Producto producto;

    public float getSubTotal(){
        return 0;
    }

    public boolean validarDestino(String destino){
        return true;
    }
}