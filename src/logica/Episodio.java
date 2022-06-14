/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;


public class Episodio {

    private String nombre;
    private final ArrayList<Personaje> personajes;

    public Episodio(String nombre) {
        this.nombre = nombre;
        this.personajes = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPersonaje(Personaje personaje) {
        this.personajes.add(personaje);
    }

    public double calcularCosto() {
        double precioEpisodio = 0;

        try {
            for (Personaje personaje : personajes) {
                precioEpisodio += personaje.calcularSueldo();
            }
        } catch (Exception e) {
            return 0;
        }

        return precioEpisodio;
    }

    public ArrayList<Personaje> getHeroes() {
        ArrayList<Personaje> heroes = new ArrayList();
        for (Personaje personaje : this.personajes) {
            if (personaje instanceof Heroe) {
                heroes.add(personaje);
            }
        }

        return heroes;
    }

    public ArrayList<Personaje> getVillanos() {
        ArrayList<Personaje> villanos = new ArrayList();
        for (Personaje personaje : this.personajes) {
            if (personaje instanceof Villano) {
                villanos.add(personaje);
            }
        }

        return villanos;
    }
    public Personaje buscarHeroe(String nombre){
        ArrayList<Personaje>heroe = this.getHeroes();
        for (Personaje personaje : heroe){
            if (personaje.getNombre().toLowerCase().equals(nombre.toLowerCase())) {
                return personaje;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Episodio{" + "nombre=" + nombre;
    }
}


