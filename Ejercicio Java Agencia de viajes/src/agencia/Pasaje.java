package agencia;

public class Pasaje extends Producto{
    String fecha;
    String compañia;
    String destino;

    public Pasaje(int codigo, String descripcion, float precio) {
        super(codigo, descripcion, precio);
    }

    public Pasaje(int codigo, String descripcion, float precio, String fecha, String compañia, String destino) {
        super(codigo, descripcion, precio);
        this.fecha = fecha;
        this.compañia = compañia;
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }


    public String getCompañia() {
        return compañia;
    }


    public String getDestino() {
        return destino;
    }


}