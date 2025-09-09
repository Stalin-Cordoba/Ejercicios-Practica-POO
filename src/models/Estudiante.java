// Esta clase es para el ejercicio 1

package models;

public class Estudiante {

    // Atributos
    private String nombre;
    private int edad;
    private double[] notas; // Número de notas utilizadas: 5

    // Constructor
    public Estudiante(String nombre, int edad, double[] notas) {
        this.nombre = nombre;
        this.edad = edad;
        this.notas = notas;
    }

    // Métodos
    public double promedioEstudiante(){

        double promedio = 0.0;

        for (int i = 0; i < notas.length; i++){

            promedio += notas[i];
        }

        return promedio / notas.length;
    }

    public void mostrarDatos(){

        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        for (int i = 0; i < notas.length; i++){

            System.out.println("Nota #" + i + ": " + this.notas[i]);
        }
        System.out.println("Promedio: " + promedioEstudiante() + "\n");
    }
}
