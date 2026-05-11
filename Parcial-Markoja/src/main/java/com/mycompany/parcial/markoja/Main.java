/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parcial.markoja;

import Clases.Libro;
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
      
        do {
            System.out.println("Bienvenido al gestor de Biblioteca");
            System.out.println("Por favor ingrese el número de opción solicitada.");
            System.out.println("1 - Agregar libro \n 2 - Listar materiales \n 3 - Buscar por título \n 4 - Prestar material \n 5 - Devolver Material \n 6 - Salir");
             opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("opcion 1");
                    break;
                case 2:
                    System.out.println("opcion 2");
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
