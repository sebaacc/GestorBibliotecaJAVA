/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.biblioteca.ui;
import com.biblioteca.modelo.Biblioteca;
import com.biblioteca.modelo.Libro;
import com.biblioteca.modelo.MaterialBiblioteca;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Biblioteca biblioteca = new Biblioteca();
      
        do {            
            System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓.˖✧📓°Bienvenido/a al gestor de materiales de biblioteca°📓✧˖.▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
            System.out.println("__Opciones disponibles________");
            System.out.println("\n☕︎ 1. Agregar libro \n☕︎ 2. Listar materiales \n☕︎ 3. Buscar por título \n☕︎ 4. Prestar material \n☕︎ 5. Devolver Material \n☕︎ 6. Salir \n______________________________");
            System.out.println("Por favor ingrese el número de opción solicitada: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    sc.nextLine();// limpiar siempre el buffer antes de un sc.NextLine, si el anterior fue un sc.NextInt. 
                    System.out.println("✦ Eligió opción 1 - Agregar libro...");
                    System.out.println("\nPor favor ingrese el título: ");
                    String titulo = sc.nextLine();
                    
                    System.out.println("\nPor favor ingrese el año de publicación: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("¡Error! Debe ingresar un número válido.");
                        System.out.print("Intente de nuevo: ");
                        sc.next();
                    }
                    int anio = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("\nPor favor ingrese el autor: ");
                    String autor = sc.nextLine();      
                    
                    System.out.println("\nCreando libro...");
                    Libro libroAgregar = new Libro(titulo, anio, autor);
                    
                    System.out.println("\nLibro creado con éxito. \n Agregando el libro nuevo a la biblioteca...");
                    biblioteca.agregarMaterial(libroAgregar);
                    
                    System.out.println("\nLibro agregado con éxito. Volviendo al menú... \n");
                    break;
                case 2:
                    sc.nextLine();// limpiar siempre el buffer antes de un sc.NextLine, si el anterior fue un sc.NextInt. 
                    System.out.println("✦ Eligió opción 2 - Listar materiales...");
                    System.out.println("Listando materiales...");
                    biblioteca.listarMateriales();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("✦ Eligió opción 3 - Buscar por título");
                    System.out.println("\nPor favor ingrese el título del libro: ");
                    String tiBusqueda = sc.nextLine();
                    System.out.println("Buscando...");
                    MaterialBiblioteca resultado = biblioteca.buscarPorTitulo(tiBusqueda);
                    System.out.println("Resultado de la búsqueda: \n" + resultado);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("✦ Eligió opción 4 - Prestar material...");
                    System.out.println("\nPor favor ingrese titulo de material a prestar: ");
                    String tiPrestar = sc.nextLine();
                    System.out.println("Buscando...");
                    biblioteca.prestarMaterial(tiPrestar);
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("✦ Eligió opción 5 - Devolver Material...");
                    System.out.println("\nPor favor ingrese titulo de material a devolver: ");
                    String tiDevolver = sc.nextLine();
                    System.out.println("Buscando...");
                    biblioteca.devolverMaterial(tiDevolver);
                    break;
                case 6:
                    System.out.println("✦ Eligió opción 6 ...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
                    break;
            }
        } while (opcion != 6 ); 
            sc.close();
    }
}
