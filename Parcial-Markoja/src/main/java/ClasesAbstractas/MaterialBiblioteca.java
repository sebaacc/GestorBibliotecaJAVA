package ClasesAbstractas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Seba
 */
public abstract class MaterialBiblioteca {
    
    protected String titulo;   
    protected int anio;  
    protected Boolean prestado = false;

    public MaterialBiblioteca(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
        this.prestado = false;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\nAño: " + anio + "\nPrestado: " + prestado;
    }

    public abstract void prestar();
    public abstract void devolver();

}
