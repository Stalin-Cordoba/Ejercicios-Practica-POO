package run;

import java.util.Scanner;
import models.Producto;

/*3. Inventario de Productos
Objetivo: Clase Producto con nombre, código y cantidad. Crea un arreglo para simular un inventario.
•    Método para añadir productos.
•    Método para buscar por código.
•    Método para mostrar productos con stock < 5.*/

public class Ejercicio3 {

    static Scanner entrada = new Scanner(System.in); // Variable Scanner

    public static String setNombre() {

        System.out.println("Ingrese el nombre del producto");
        entrada.nextLine();
        return entrada.nextLine();
    }

    public static String setId() {

        System.out.println("Ingrese un código para el producto");
        return entrada.nextLine();
    }

    public static int setCantidad() {

        int cant;
        System.out.println("Ingrese la cantidad a registrar del producto");

        while (true){

            cant = entrada.nextInt();

            if (cant <= 0){

                System.out.println("Ingrese una cantidad positiva");
            }
            else{

                return cant;
            }
        }
    }

    // Función main
    public static void main(String[] args) {

        Producto[] inventario = new Producto[100]; //Límite: 100

        int index = 0;
        String eleccion;
        boolean confirmarSalir = false;

        do {

            System.out.println("\nBienvenido a la tienda!");
            System.out.println("¿Qué desea hacer?\n");

            System.out.println("1) Agregar producto (Máximo permitido: 100)");
            System.out.println("2) Buscar producto");
            System.out.println("3) Revisar las cantidades de cada producto");
            System.out.println("0) Salir");

            eleccion = entrada.next();

            switch (eleccion) {

                case "1":

                    Producto newProducto = new Producto(setNombre(), setId(), setCantidad());

                    inventario[index] = newProducto;
                    newProducto.mostrarDatos();
                    index++;

                    break;
                case "2":

                    System.out.println("Ingrese el código del producto que desea buscar");
                    entrada.nextLine();
                    while(true){

                        eleccion = entrada.nextLine();

                        if (eleccion.isEmpty()){

                            System.out.println("Ingrese un código");
                        }
                        else{

                            break;
                        }
                    }

                    System.out.println("\nProductos encontrados");
                    for (int i = 0; i < index; i++){


                        if(inventario[i].getId().toLowerCase().contains(eleccion.toLowerCase())){

                            inventario[i].mostrarDatos();
                        }
                    }

                    break;
                case "3":

                    System.out.println("Cantidades de cada producto respectivamente");
                    for (int i = 0; i < index; i++){

                        inventario[i].mostrarDatos();
                    }

                    System.out.println("\nProductos con cantidades bajas");

                    for (int i = 0; i < index; i++){

                        if(inventario[i].getCantidad() <= 5){

                            System.out.println("Producto " + (i + 1) + ": " + inventario[i].getCantidad());
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
