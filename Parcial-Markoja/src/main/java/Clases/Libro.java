/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import ClasesAbstractas.MaterialBiblioteca;

/**
 *
 * @author Seba
 */
public class Libro extends MaterialBiblioteca{

    private String autor;
  
    public Libro (String titulo, int anio, String autor) {
        super(titulo, anio);
        this.autor = autor;
    }
  
  //implementación de métodos abstractos
  
    @Override
    public void prestar() {
        super.prestado = true;
    }

    @Override
    public void devolver() {
        super.prestado = false;
    }
    
    @Override
    public String getTitulo(){
        return super.titulo;
    }
}
