package ClasesAbstractas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.time.Year;

/**
 *
 * @author Seba
 */
public abstract class MaterialBiblioteca {
    
  private String titulo;   
    private Year anio;  
    private Boolean prestado = false;

public MaterialBiblioteca(String titulo, Year anio) {
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
