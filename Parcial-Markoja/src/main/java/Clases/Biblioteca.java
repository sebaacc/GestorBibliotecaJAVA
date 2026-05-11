/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import ClasesAbstractas.MaterialBiblioteca;
import java.util.*;

/**
 *
 * @author Seba
 */
public class Biblioteca {
    List<MaterialBiblioteca> lista = new ArrayList<MaterialBiblioteca>();
    public void agregarMaterial(MaterialBiblioteca m) {
        lista.add(m);
    }

    public void listarMateriales() {
        System.out.println("Materiales de biblioteca: " + lista);
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
        }
    }

    public void devolverMaterial(String titulo) {
        MaterialBiblioteca m = buscarPorTitulo(titulo);
        if (m != null) {
            m.devolver();
        }
    }
}

