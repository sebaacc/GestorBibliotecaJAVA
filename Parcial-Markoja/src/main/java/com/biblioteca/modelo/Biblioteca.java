/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.biblioteca.modelo;

import java.util.*;

/**
 *
 * @author Seba
 */
public class Biblioteca {
    List<MaterialBiblioteca> lista;
    
    
    
    public Biblioteca() {
        this.lista = new ArrayList<>();
        //Acá puedo añadir luego libros para inicializar la biblioteca
        
        Libro libro1 = new Libro("Harry Potter y el misterio del príncipe",2005,"J.K. Rowling");
        lista.add(libro1);
        Libro libro2 = new Libro("La vuelta al mundo en ochenta días",1873,"Julio Verne");
        lista.add(libro2);
    }
    
    public void agregarMaterial(MaterialBiblioteca m) {
        lista.add(m);
    }

    public void listarMateriales() {
        System.out.println("Materiales de biblioteca: \n" + lista);
    }

    public MaterialBiblioteca buscarPorTitulo(String titulo) {
        for (MaterialBiblioteca m : lista) {
            if (m.getTitulo().equalsIgnoreCase(titulo)) {
                return m; // 
            }
        }
        System.out.println("No se encontró el material: " + titulo);
        return null;
    }

    public void prestarMaterial(String titulo) {
        MaterialBiblioteca m = buscarPorTitulo(titulo);
        if (m != null) {
            m.prestar();
            System.out.println("Material prestado con éxito!.");
        }
    }

    public void devolverMaterial(String titulo) {
        MaterialBiblioteca m = buscarPorTitulo(titulo);
        if (m != null) {
            m.devolver();
            System.out.println("Material devuelto con éxito!.");
        }
    }
    
    
}

