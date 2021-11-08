package agencia;

public class Main {
    public static void main(String[] args) {
        Cliente cl1 = new Cliente(45, "Venancio", "456879", "Venancio@3232.com");
        System.out.println(cl1.getDni() + " " + cl1.getNombre() + " " + cl1.getTelefono() + " " + cl1.getMail());

        Pasaje pr1 = new Pasaje(23, "Vuelo", 12300, "01/02/2021", "VMEX", "Paris");
        System.out.println(pr1.getCodigo() + " " + pr1.getDescripcion() + " " + pr1.getPrecio() + " "
                           + pr1.getFecha() + " " + pr1.getCompañia() + " " + pr1.getDestino());

        Alojamiento a = new Alojamiento(69, "Florencio", 45689, "Le florencie");
        System.out.println(a.getCodigo() + " " + a.getDescripcion() + " " + a.getPrecio() + " " + a.nombreAlojamiento);

        Paquete paq = new Paquete(55, "adasda", 5656 );
        System.out.println(paq.getDescuentos());
    }
}