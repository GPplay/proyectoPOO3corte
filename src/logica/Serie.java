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
public class Serie {
    private String nombre;
    private int anio;
    private final ArrayList<Episodio> episodios;

    public Serie(String nombre, int año) {
        this.nombre = nombre;
        this.anio = año;
        this.episodios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAño(int año) {
        this.anio = año;
    }

    public int getCantidadEpisodio() {
        return this.episodios.size();
    }

    public ArrayList<Episodio> getEpisodios() {
        return this.episodios;
    }
    
    public Episodio getEpisodioPorNombre(String nombre){
        for(Episodio episodio: this.episodios){
            if(episodio.getNombre().toLowerCase().equals(nombre.toLowerCase())){
                return episodio;
            }
        }
        return null;
    }

    public void agregarEpisodio(Episodio episodio){
        this.episodios.add(episodio);
    }


    @Override
    public String toString() {
        return "Series{" + "nombre=" + nombre + ", anio=" + anio + ", episodios=" + episodios + '}';
    }
}
