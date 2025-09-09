package run;

import java.util.Scanner;
import models.Libro;

/*2. Gestor de Libros
Objetivo: Clase Libro con atributos: título, autor (String) y año. Usa un arreglo para almacenar varios libros.
•    Permite buscar libros por autor o palabra clave en el título.
•    Mostrar los libros publicados después del año 2010.*/

public class Ejercicio2 {

    static Scanner entrada = new Scanner(System.in); // Variable 'Scanner'

    public static String setTitulo(){

        System.out.println("Ingrese el título del libro");
        entrada.nextLine();
        return entrada.nextLine();
    }

    public static String setAutor(){

        System.out.println("Ingrese el autor del libro");
        return entrada.nextLine();
    }

    public static int setYearPublicacion(){

        int year;
        System.out.println("Ingrese el año de la publicación del libro");

        while (true){

            year = entrada.nextInt();

            // Se asegura que el year esté correcto
            if (year <= 0 || year > 2025){

                System.out.println("Ingrese un año válido");
            }
            else{

                return year;
            }
        }
    }

    // Función main
    public static void main(String[] args) {

        // Variables de inicialización
        Libro[] listaLibros = new Libro[60]; // Límite: 60
        int index = 0;
        boolean confirmarSalir = false;

        String eleccion;
        int elegirYear; // A la hora de buscar libros publicados después de un año dado

        do {

            // Menú de opciones

            System.out.println("Qué desea hacer?\n");

            System.out.println("1. Agregar Libro (Límite: 60)");
            System.out.println("2. Buscar libro por autor");
            System.out.println("3. Buscar libro por título");
            System.out.println("4. Buscar libro después de un año dado");
            System.out.println("0. Salir del programa");

            eleccion = entrada.next();

            switch (eleccion) {

                case "1":

                    Libro libroNuevo = new Libro(setTitulo(), setAutor(), setYearPublicacion());

                    listaLibros[index] = libroNuevo;
                    libroNuevo.mostrarInfo();
                    index++;
                    break;
                case "2":

                    System.out.println("Ingrese el nombre del autor del libro que quiere buscar");
                    entrada.nextLine();

                    while (true){

                        eleccion = entrada.nextLine();

                        // Se asegura que el título no está vacío
                        if (eleccion.isEmpty()){

                            System.out.println("Ingrese un nombre de autor");
                        }
                        else{

                            break;
                        }
                    }

                    System.out.println("\nLibros encontrados:");
                    for (int i = 0; i < index; i++){

                        // Las cadenas se vuelven en minúscula para facilitar la búsqueda
                        if (listaLibros[i].getAutor().toLowerCase().contains(eleccion.toLowerCase()))
                        {
                            listaLibros[i].mostrarInfo();
                        }
                    }
                    break;
                case "3":

                    System.out.println("Ingrese el título del libro que quiere buscar:");
                    entrada.nextLine();

                    while (true){

                        eleccion = entrada.nextLine();

                        // Se asegura que el título no está vacío
                        if (eleccion.isEmpty()){

                            System.out.println("Ingrese un título");
                        }
                        else{

                            break;
                        }
                    }

                    System.out.println("\nLibros encontrados:");
                    for (int i = 0; i < index; i++){

                        // Las cadenas se vuelven en minúscula para facilitar la búsqueda
                        if (listaLibros[i].getTitulo().toLowerCase().contains(eleccion.toLowerCase()))
                        {
                            listaLibros[i].mostrarInfo();
                        }
                    }
                    break;
                case "4":

                    System.out.println("Ingrese el año para mostrar libros publicados después de ese año");
                    while (true){

                        elegirYear = entrada.nextInt();

                        // Se asegura que el year esté correcto
                        if (elegirYear < 0 || elegirYear > 2025){

                            System.out.println("Ingrese un año válido");
                        }
                        else{

                            break;
                        }
                    }

                    System.out.println("\nLibros encontrados:");
                    for (int i = 0; i < index; i++){

                        if (listaLibros[i].getYearPublicacion() >= elegirYear)
                        {
                            listaLibros[i].mostrarInfo();
                        }
                    }
                    break;
                case "0":

                    confirmarSalir = true;
                    break;
                default:

                    System.out.println("Ingrese una opción válida");
                    break;
            }
        } while(!confirmarSalir);
    }
}
