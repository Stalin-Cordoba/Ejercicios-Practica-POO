package run;

import java.util.Scanner;
import models.Estudiante;

/*1. Sistema de Estudiantes
Objetivo: Crear una clase Estudiante con nombre, edad y notas (arreglo de double). Implementa métodos para calcular el promedio y mostrar los datos.
•    Usa una clase principal para registrar varios estudiantes (arreglo de objetos).
•    Muestra los estudiantes con promedio mayor a 8.0.*/

public class Ejercicio1 {

    static Scanner entrada = new Scanner(System.in); // Se declara una sola variable 'Scanner'

    public static String setNombre(){

        System.out.println("Ingrese el nombre del estudiante:");

        return entrada.nextLine();
    }

    public static int setEdad(){

        int edad;
        System.out.println("Ingrese el edad del estudiante:");

        while (true){

            edad = entrada.nextInt();

            // Evita que se ingrese una nota negativa
            if (edad <= 0){

                System.out.println("Ingrese una edad válida");
            }
            else{

                return edad;
            }
        }
    }

    public static double[] setNotas(){

        double[] notas = new double[5];

        for (int i = 0; i < notas.length; i++){

            System.out.println("Ingrese la nota del curso #" + (i + 1) + ":");

            while (true){

                notas[i] = entrada.nextDouble();

                // Verifica que las notas estén correctas
                if (notas[i] < 0.0 || notas[i] > 10.0){

                    System.out.println("La nota debe ser entre 0.0 y 10.0");
                }
                else{

                    break;
                }
            }
        }

        return notas;
    }

    // Función main
    public static void main(String[] args) {

        int index = 0;
        boolean confirmarSalir = false;

        Estudiante[] listaEstudiantes = new Estudiante[60];

        while (true){

            System.out.println("Ingrese los datos del estudiante\n");

            // Se crea un nuevo objeto 'Estudiante'
            Estudiante estudiante = new Estudiante(setNombre(), setEdad(), setNotas());

            System.out.println("\nResumen del estudiante:");

            // Resume los datos
            listaEstudiantes[index] = estudiante;
            estudiante.mostrarDatos();
            index++; // Se incrementa la cantidad de estudiantes

            String confirmacion; // Variable utilizada para el menú de opciones

            entrada.nextLine();
            while (true){


                // Menú de opciones
                System.out.println("¿Que desea hacer ahora?");
                System.out.println("\n1) Agregar estudiante (Límite: 60)");
                System.out.println("2) Mostrar estudiantes con promedio mayor a 8.0");
                System.out.println("0) Salir del programa");

                confirmacion = entrada.nextLine();

                switch (confirmacion){

                    case "1":

                        // Verifica que no se haya pasado del límite, que es 60
                        if(index == 60){

                            System.out.println("Ya se alcanzó el límite de estudiantes");
                        }
                        else{

                            System.out.println("El programa continuá\n");
                        }
                        break;

                    case "2":

                        for (int i = 0; i < index; i++){

                            // Verifica si el estudiante dado tiene un promedio mayor a 8.0
                            if (listaEstudiantes[i].promedioEstudiante() >= 8.0){

                                listaEstudiantes[i].mostrarDatos();
                            }
                        }

                        break;

                    case "0":

                        confirmarSalir = true;
                        break;

                    default:

                        System.out.println("Ingrese una opción válida");
                }

                // Se rompe el bucle 'while' contenido aquí, si la opción es '1' o '0'
                if (confirmacion.equals("1") || confirmacion.equals("0")){

                    break;
                }
            }

            // El primer bucle 'while' (o sea, el de la línea 78) se rompe si la opción fue '0'
            if (confirmarSalir){

                break;
            }
            }
        }
    }