// Esta clase es para el Ejercicio 4

package models;

public class Contacto {

    // Atributos
    private String nombre;
    private String telefono;
    private String correo;

    // Constructor
    public Contacto(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    // Métodos
    public void mostrarInfo(){

        System.out.println("\nDatos del contacto:\n");

        System.out.println("Nombre: " + this.nombre);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Correo: " + this.correo + "\n");
    }
}
