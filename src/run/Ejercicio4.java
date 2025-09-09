package run;

import java.util.Scanner;
import models.Contacto;

/*4. Agenda de Contactos
Objetivo: Clase Contacto con nombre, teléfono, correo (todo String). Usa un arreglo para guardar contactos.
•    Permite añadir, buscar por nombre, y mostrar todos.
•    Metodo para buscar por dominio del correo (@gmail.com, etc).*/

public class Ejercicio4 {

    static Scanner entrada = new Scanner(System.in);

    public static String setNombre(){

        System.out.println("Ingrese el nombre:");
        return entrada.nextLine();
    }

    public static String setTelefono(){

        System.out.println("Ingrese el telefono:");
        return entrada.nextLine();
    }

    public static String setCorreo(){

        String correo;

        System.out.println("Ingrese el correo:");
        while (true){

            correo = entrada.nextLine();

            // Se asegura que el correo tenga por lo menos '@' y '.com'
            if (correo.contains("@") && correo.contains(".com")){

                break;
            }
            else{

                System.out.println("Ingrese un correo válido");
            }
        }

        return correo;
    }

    // Función main
    public static void main(String[] args) {

        Contacto[] listaContactos = new Contacto[100];

        int index = 0;
        boolean confirmarSalir = false;
        String eleccion;

        do{

            System.out.println("Qué desea hacer?\n");

            System.out.println("1. Agregar Contacto (Límite: 100)");
            System.out.println("2. Mostrar Contactos");
            System.out.println("3. Mostrar Contacto por nombre");
            System.out.println("4. Mostrar Contacto por dominio de correo");
            System.out.println("0. Salir");

            eleccion = entrada.nextLine();

            switch (eleccion){

                case "1":

                    Contacto contactoNuevo = new Contacto(setNombre(), setTelefono(), setCorreo());

                    listaContactos[index] = contactoNuevo;
                    contactoNuevo.mostrarInfo();
                    index++;

                    break;
                case "2":

                    for (int i = 0; i < index; i++){

                        listaContactos[i].mostrarInfo();
                    }
                    break;
                case "3":

                    System.out.println("Ingrese el nombre del contacto que desee buscar");

                    while(true){

                        eleccion = entrada.nextLine();

                        if (eleccion.isEmpty()){

                            System.out.println("Ingrese un nombre");
                        }
                        else{

                            break;
                        }
                    }

                    System.out.println("Contactos encontrados:");
                    for (int i = 0; i < index; i++){

                        if (listaContactos[i].getNombre().toLowerCase().contains(eleccion.toLowerCase())){

                            listaContactos[i].mostrarInfo();
                        }
                    }

                    break;
                case "4":

                    System.out.println("Ingrese el dominio de correo del contacto que desee buscar");

                    while(true){

                        eleccion = entrada.nextLine();

                        if (eleccion.contains("@") && eleccion.contains(".com")){

                            break;
                        }
                        else{

                            System.out.println("Ingrese un correo válido");
                        }
                    }

                    System.out.println("Contactos encontrados:");
                    for (int i = 0; i < index; i++){

                        if (listaContactos[i].getCorreo().toLowerCase().contains(eleccion.toLowerCase())){

                            listaContactos[i].mostrarInfo();
                        }
                    }
                    break;
                case "0":

                    confirmarSalir = true;
                    break;
                default:

                    System.out.println("Opcion no permitida");
                    break;
            }
        } while(!confirmarSalir);
    }
}
