// Esta clase es para el Ejercicio 3

package models;

public class Producto {

    // Atributos
    private String nombre;
    private String id;
    private int cantidad;

    // Constructor
    public Producto(String nombre, String id, int cantidad) {
        this.nombre = nombre;
        this.id = id;
        this.cantidad = cantidad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    // Métodos
    public void mostrarDatos(){

        System.out.println("\nDatos del producto:\n");

        System.out.println("Nombre del producto: " + this.nombre);
        System.out.println("Código: " + this.id);
        System.out.println("Cantidad: " + this.cantidad + "\n");
    }
}
