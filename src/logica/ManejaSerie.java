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
public class ManejaSerie     {
    private final ArrayList<Serie> series;

    public ManejaSerie() {
        series = new ArrayList();
    }
    
    public void agregarSerie(String nombre, int anio){
        this.series.add(
                new Serie(nombre, anio)
        );
    }

    public ArrayList<Serie> getSeries() {
        return series;
    }
}