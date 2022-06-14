/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Gybram
 */
public abstract class Personaje {
    private String nombre;
    private String identidadSecreta;

    public Personaje(String nombre, String identidadScreta) {
        this.nombre = nombre;
        this.identidadSecreta = identidadScreta;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentidadScreta() {
        return identidadSecreta;
    }

    public void setIdentidadScreta(String identidadScreta) {
        this.identidadSecreta = identidadScreta;
    }
    
    public abstract double calcularSueldo();

    @Override
    public String toString() {
        return "Nombre:" + nombre + "\nIdentidadScreta:" + identidadSecreta ;
    }
    
    
}
