package agencia;

public class Alojamiento extends Producto{
    String nombreAlojamiento;

    public Alojamiento(int codigo, String descripcion, float precio) {
        super(codigo, descripcion, precio);
    }

    public Alojamiento(int codigo, String descripcion, float precio, String nombreAlojamiento) {
        super(codigo, descripcion, precio);
        this.nombreAlojamiento = nombreAlojamiento;
    }

}