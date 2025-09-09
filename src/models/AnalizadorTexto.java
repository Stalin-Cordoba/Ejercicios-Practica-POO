// Esta clase es para el Ejercicio 5

package models;

import java.util.Scanner;

public class AnalizadorTexto {

    Scanner entrada = new Scanner(System.in);

    // Atributos
    private String texto;
    private String[] palabras;

    // Constructor
    public AnalizadorTexto(String texto, String[] palabras) {
        this.texto = texto;
        this.palabras = palabras;
    }

    // Getters
    public String getTexto() {
        return texto;
    }

    public String[] getPalabras() {
        return palabras;
    }

    // Métodos
    public int contarPalabras(){

        // Retorna el número de elementos que hay en el Array 'Palabras'
        return palabras.length;
    }

    public void contarPalabraEspecifica(){

        String palabraBuscar;
        int conteo = 0;

        System.out.println("Ingrese la palabra");

        while (true){

            palabraBuscar = entrada.nextLine();

            if (palabraBuscar.isEmpty()){

                System.out.println("Ingrese una palabra");
            }
            else{

                break;
            }
        }

        for (int i = 0; i < palabras.length; i++) {

            // Verifica si las dos palabras son iguales (ignorando si tienen mayúsculas)
            if (palabras[i].equalsIgnoreCase(palabraBuscar)){

                conteo++;
            }
        }

        if(conteo == 0)
        {

            System.out.println("No se encontró la palabra que usted especificó");
        }
        else{

            System.out.println("Se encontró la palabra " + palabraBuscar + " un total de " + conteo + " veces");
        }
    }

    public void reemplazarPalabra(){

        String palabraBuscar, palabraReemplazar;
        boolean palabraEncontrada = false;

        System.out.println("Ingrese la palabra a buscar:");

        while (true){

            palabraBuscar = entrada.nextLine();

            if (palabraBuscar.isEmpty()){

                System.out.println("Ingrese una palabra");
            }
            else{

                break;
            }
        }

        System.out.println("Ingrese la palabra a reemplazar:");

        while (true){

            palabraReemplazar = entrada.nextLine();

            if (palabraReemplazar.isEmpty()){

                System.out.println("Ingrese una palabra");
            }
            else{

                break;
            }
        }

        // Recorre todo el Array 'Palabras', para encontrar la palabra a buscar, y así reemplazarla
        for (int i = 0; i < palabras.length; i++) {

            // Verifica si las dos palabras son iguales (ignorando si tienen mayúsculas)
            if (palabras[i].equalsIgnoreCase(palabraBuscar)){

                palabras[i] = palabraReemplazar;
                palabraEncontrada = true;
                break;
            }
        }

        // Se verifica si se encontró la palabra o no
        if (palabraEncontrada){

            System.out.println("El texto quedaría así:");
            for (int i = 0; i < palabras.length; i++) {

                System.out.printf(palabras[i] + " ");
            }
        }
        else{

            System.out.println("La palabra que se quería buscar no se encontró");
        }
    }
}
