package agencia;

import java.util.Collection;

public class Cliente {
    int dni;
    String nombre;
    String telefono;
    String mail;
    Collection ventas;

    public Cliente(int dni, String nombre, String telefono, String mail) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getMail() {
        return mail;
    }

}