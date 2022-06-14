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
public class Villano extends Personaje{
    private String descripcionAtaque;
    private boolean usaArma;
    private Heroe enemigo;

    public Villano(String descripcionAtaque, boolean usaArma, Heroe enemigo, String nombre, String identidadSecreta){
        super(nombre, identidadSecreta);
        this.descripcionAtaque = descripcionAtaque;
        this.usaArma = usaArma;
        this.enemigo = enemigo;
    }
    
    public String getDescripcionAtaque() {
        return descripcionAtaque;
    }

    public void setDescripcionAtaque(String descripcionAtaque) {
        this.descripcionAtaque = descripcionAtaque;
    }

    public boolean UsaArma() {
        return usaArma;
    }
    
    public void setUsaArma(boolean usaArma) {
        this.usaArma = usaArma;
    }

    public Heroe getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(Heroe enemigo) {
        this.enemigo = enemigo;
    }

    @Override
    public String toString() {
        String condicion;
        if(usaArma==true){
            condicion="Si";
        }else{
            condicion="No";
        }
        return super.toString() + "\n Es un:Villano" + "\nDescripcionAtaque:" + descripcionAtaque + "\nUsaArma:" + condicion + "\nEnemigo:" + enemigo.getNombre()+"\nSueldo:"+calcularSueldo();
    }

    @Override
    public double calcularSueldo() {
        return usaArma ? 300000 : 250000;
    }
    
    
}
