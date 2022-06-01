/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import java.util.ArrayList;

/**
 *
 * @author Gybram
 */
public class Episodio {
    private String nombre;
    private final ArrayList<Personaje> personajes = new ArrayList();   
    

    public Episodio(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPersonaje(Personaje personaje){
        this.personajes.add(personaje);
    }
    
    public double calcularCosto(){
        double precioEpisodio = 0;
        
        try{
            for(Personaje personaje: personajes){
                precioEpisodio = personaje.calcularSueldo();
            }
        }catch(Exception e){
            return 0;
        }
        
        return precioEpisodio;
    }

    @Override
    public String toString() {
        return "Episodio{" + "nombre=" + nombre ;
    }
}
