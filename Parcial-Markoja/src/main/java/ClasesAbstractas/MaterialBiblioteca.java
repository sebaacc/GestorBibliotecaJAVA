/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.time.Year;

package ClasesAbstractas;

/**
 *
 * @author Seba
 */
public abstract class MaterialBiblioteca {
    
  private String titulo;   
  private Year anio;  
  private Boolean prestado; 

  public String toString(){
    return System.out.System.out.println("Título: ",titulo,"\n Año: ",anio, "\n Prestado: ",prestado);
  }

  abstract void prestar() {
    this.prestado = true;
  }
  abstract void devolver() {
    this.prestado = false;
  }


}
