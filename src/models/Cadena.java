// Esta clase es para el Ejercicio 10

package models;

public class Cadena {

    // Atributo
    private String palabra;

    // Constructor
    public Cadena(String palabra) {
        this.palabra = palabra;
    }

    // Métodos
    public String palabraMayuscula(){

        return palabra.toUpperCase();
    }

    public String palabraMinuscula(){

        return palabra.toLowerCase();
    }

    public String palabraInvertida(){

        // Divide el N° de caracteres en elementos de un arreglo
        String[] caracteres = palabra.split("");
        String palabraInvertida = "";

        for (int i = 0; i < palabra.length(); i++) {

            // Se va acomodando los caracteres
            caracteres[i] = palabra.split("")[palabra.length() - i - 1];
        }

        for (int i = 0; i < caracteres.length; i++) {

            // Posteriormente, se concatena cada elemento del array dado, en una variable nueva
            palabraInvertida = palabraInvertida.concat(caracteres[i]);
        }

        return palabraInvertida;
    }

    public void esPalindromo(){

        // Verifica si la palabra en sí, es igual a ella misma pero invertida
        if(palabra.equals(palabraInvertida())){

            System.out.println("La palabra es un palindromo");
        }
        else{

            System.out.println("La palabra no es un palindromo");
        }
    }

    public int numeroVocales(){

        int conteo = 0;
        String[] caracteres = palabra.split(""); // Divide el N° de caracteres en elementos de un arreglo

        for (int i = 0; i < caracteres.length; i++) {

            // Está condición SUPER LARGA, verifica si el caracter es una vocal
            if (caracteres[i].equalsIgnoreCase("a") || caracteres[i].equalsIgnoreCase("e") || caracteres[i].equalsIgnoreCase("i") || caracteres[i].equalsIgnoreCase("o") || caracteres[i].equalsIgnoreCase("u")){

                conteo++;
            }
        }

        return conteo;
    }

    public int numeroConsonantes(){

        // Retorna la diferencia del N° de letras de la palabra, con el N° de vocales de la palabra
        return palabra.length() - numeroVocales();
    }
}
