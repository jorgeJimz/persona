/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage2;

/**
 *
 * @author Usuario
 */
public class SubPersona {
     String nombre;
     int edad;
     String descripcion;
   
    
    public SubPersona(){
    }
  public void establecerNombre(String nombre) {
        this.nombre = nombre;
        
    }
    public String obtenerNombre () {
        return this.nombre;
        
    }
  public void establecerEdad(int edad) {
        this.edad = edad;
        
    }
    public int obtenerEdad () {
        return this.edad;
        
    }
    public void establecerDescripcion(String descripcion) {
        this.descripcion = descripcion;
        
    }
    public String obtenerDescripcion () {
        return this.descripcion;
        
    }
    
    public void imprimirDatos(){
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Descripcion: " + descripcion);
    }
    
}
