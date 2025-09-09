package run;

import models.Curso;
import java.util.Scanner;

/*7. Sistema de Calificaciones
Objetivo: Clase Curso que tiene un nombre y una matriz de notas (estudiantes x evaluaciones).
•    Método para promedio por estudiante.
•    Método para promedio por evaluación.
•    Estudiante con mejor rendimiento.*/

public class Ejercicio7 {

    static Scanner entrada = new Scanner(System.in);

    public static String ingresarNombre(){

        while (true){

            String nombre = entrada.nextLine();

            if(nombre.isBlank()){

                System.out.println("Ingrese un nombre para el estudiante");
            }
            else{

                return nombre;
            }
        }
    }

    public static double ingresarNota(){

        while (true){

            double nota = entrada.nextDouble();

            if(nota < 0 || nota > 100){

                System.out.println("Ingrese una nota correcta");
            }
            else{

                return nota;
            }
        }
    }

    // Función main
    public static void main(String[] args) {

        // Datos: 5 estudiantes, 3 evaluaciones
        Curso POO = new Curso(new String[5], new double[5][3]);

        System.out.println("Bienvenido al curso de Programación Orientada a Objetos!");
        System.out.println("Es hora de que ingrese las notas de sus 5 estudiantes! (Rango de notas: 0 - 100)");

        // 'POO.getEstudiantes().length' retorna el número de filas
        // 'POO.getEstudiantes()[0].length' retorna el número de columnas

        for (int i = 0; i < POO.getEstudiantes().length; i++) {

            System.out.println("\nIngrese el nombre del estudiante N°" + (i + 1));

            POO.getEstudiantes()[i] = ingresarNombre();

            for (int j = 0; j < POO.getEvaluaciones()[0].length; j++) {

                System.out.println("Ingrese la nota que sacó " + POO.getEstudiantes()[i] + " en la evaluación N°" + (j + 1));

                POO.getEvaluaciones()[i][j] = ingresarNota();
            }

            entrada.nextLine();
        }

        for (int i = 0; i < POO.getEstudiantes().length; i++) {

            System.out.println("Promedio de " + POO.getEstudiantes()[i] + " :" + POO.promedioEstudiante(i));
        }

        POO.promedioEvaluacion();
        System.out.println("\nMejor promedio: " + POO.mejorPromedio());
    }
}
