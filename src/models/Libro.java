// Esta clase es para el Ejercicio 2

package models;

public class Libro {

    // Atributos
    private String titulo;
    private String autor;
    private int yearPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int yearPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.yearPublicacion = yearPublicacion;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getYearPublicacion() {
        return yearPublicacion;
    }

    // Métodos
    public void mostrarInfo(){

        System.out.println("\nDatos del libro:\n");

        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Año: " + this.yearPublicacion + "\n");
    }
}
