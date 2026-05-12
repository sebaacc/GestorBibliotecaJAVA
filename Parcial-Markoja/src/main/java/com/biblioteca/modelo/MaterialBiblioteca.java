package com.biblioteca.modelo;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Seba
 */
public abstract class MaterialBiblioteca implements Prestable {
    
    protected String titulo;   
    protected int anio;  
    protected Boolean prestado;

    public MaterialBiblioteca(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
        this.prestado = false;
    }

    @Override
    public String toString() {
        return "\n✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖\n📓Título: " + titulo + "\n📓Año: " + anio + "\n📓Prestado: " + prestado;
    }
    
    @Override
    public abstract void prestar();
    
    @Override
    public abstract void devolver();
    
    public abstract String getTitulo();

}
