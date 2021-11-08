package agencia;

import java.util.Collection;

public class Paquete extends Producto{
    Collection productos;
    float descuentos;
    private float prepasa;
    private float prealo;

    public Paquete(int codigo, String descripcion, float precio) {
        super(codigo, descripcion, precio);
    }

    public float getDescuentos(){
        float descuen = (float) ((prepasa + prealo) *.05);
        return descuen;
    }
}