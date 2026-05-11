/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.biblioteca.ui;
import com.biblioteca.modelo.Biblioteca;
import com.biblioteca.modelo.Libro;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Main {

    public static void main(String[] args) {
        /*
        Libro libro1 = new Libro("Harry Potter y el misterio del príncipe",2005,"J.K. Rowling");
        System.out.println(libro1.toString());
        */
        Scanner sc = new Scanner(System.in);
        int opcion;
        Biblioteca biblioteca = new Biblioteca();
      
        do {            
            System.out.println("------------------------------------------------Bienvenido al gestor de Biblioteca------------------------------------------------");
            System.out.println("Opciones disponibles:");
            System.out.println("1 - Agregar libro \n2 - Listar materiales \n3 - Buscar por título \n4 - Prestar material \n5 - Devolver Material \n6 - Salir");
            System.out.println("Por favor ingrese el número de opción solicitada: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    sc.nextLine();// limpiar siempre el buffer antes de un sc.NextLine, si el anterior fue un sc.NextInt. 
                    System.out.println("Eligió opcion 1 - Agregar libro...");
                    System.out.println("\nPor favor ingrese el tíbulo del libro: ");
                    String titulo = sc.nextLine();
                    
                    System.out.println("\nPor favor ingrese el año de publicación del libro: ");
                    int anio = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("\nPor favor ingrese el autor del libro: ");
                    String autor = sc.nextLine();      
                    
                    System.out.println("\nCreando libro...");
                    Libro libroAgregar = new Libro(titulo, anio, autor);
                    
                    System.out.println("\nLibro creado con éxito. \n Agregando el libro nuevo a la biblioteca...");
                    biblioteca.agregarMaterial(libroAgregar);
                    
                    System.out.println("\nLibro agregado con éxito. Volviendo al menú... \n");
                    break;
                case 2:
                    sc.nextLine();// limpiar siempre el buffer antes de un sc.NextLine, si el anterior fue un sc.NextInt. 
                    System.out.println("Eligió opcion 2 - Listar materiales...");
                    System.out.println("Listando materiales...");
                    biblioteca.listarMateriales();
                    break;
                case 3:
                    System.out.println("opcion 3");
                    break;
                case 4:
                    System.out.println("opcion 4");
                    break;
                case 5:
                    System.out.println("opcion 5");
                    break;
                case 6:
                    System.out.println("opcion 6");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
                    break;
            }
        } while (opcion != 6 ); 
            sc.close();
    }
}
