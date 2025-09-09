// Esta clase es para el Ejercicio 8

package models;

public class EstadisticaTexto {

    // Atributos
    private String texto;
    private String[] palabras;

    // Constructor
    public EstadisticaTexto(String oracion, String[] palabras) {
        this.texto = oracion;
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

        int conteo = 0;
        for (int i = 0; i < palabras.length; i++){

            conteo++;
        }

        return conteo;
    }

    public void mostrarPalabrasUnicas(){

        System.out.println("\nPalabras unicas:");

        if (palabras.length == 0){

            System.out.println("No ingresó texto");
        }
        else{

            System.out.println(palabras[0]);

            for (int i = 1; i < palabras.length; i++){

                boolean palabraRepetida = false;

                for (int j = 0; j < i; j++){

                    if (palabras[i].equalsIgnoreCase(palabras[j])){

                        palabraRepetida = true;
                        break;
                    }
                }

                if (!palabraRepetida){

                    System.out.println(palabras[i]);
                }
            }
        }
    }
    
    public String palabraMasLarga(){

        String palabraMasLarga = palabras[0];

        for (int i = 1; i < palabras.length; i++){

            // Se cuenta el número de caracteres
            if(palabras[i].length() > palabraMasLarga.length()){

                palabraMasLarga = palabras[i];
            }
        }

        return palabraMasLarga;
    }

    public String palabraMasCorta(){

        String palabraMasCorta = palabras[0];

        for (int i = 1; i < palabras.length; i++){

            // Se cuenta el número de caracteres
            if(palabras[i].length() < palabraMasCorta.length()){

                palabraMasCorta = palabras[i];
            }
        }

        return palabraMasCorta;
    }
}
