/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import java.util.ArrayList;
import logica.*;


/**
 *
 * @author Gybram
 */
public class Heroe extends Personaje{
   private ArrayList<String>descripcionPoder = new ArrayList();
   private String descripcionDebilidad;
   private boolean perteneceJL; 
   private final int  COBRO_POR_VILLANO = 200000;
   private final ArrayList<Villano> villanos;


    public Heroe(String descripcionDebilidad, boolean perteneceJL, String nombre, String identidadSecreta, ArrayList descripcionPoder) {
        super(nombre, identidadSecreta);
        this.descripcionDebilidad = descripcionDebilidad;
        this.perteneceJL = perteneceJL;
        this.descripcionPoder = descripcionPoder;
        villanos = new ArrayList();
    }
   
    public ArrayList<String> getDescripcionPoder() {
        return descripcionPoder;
    }

    public void setDescripcionPoder(ArrayList<String> descripcionPoder) {
        this.descripcionPoder = descripcionPoder;
    }

    public String getDescripcionDebilidad() {
        return descripcionDebilidad;
    }

    public void setDescripcionDebilidad(String descripcionDebilidad) {
        this.descripcionDebilidad = descripcionDebilidad;
    }

    public boolean isPerteneceJL() {
        return perteneceJL;
    }

    public void setPerteneceJL(boolean perteneceJL) {
        this.perteneceJL = perteneceJL;
    }
    
    public ArrayList<Villano> getVillanos() {
        return villanos;
    }
    public void agregarEnemigo(Villano villano){
    this.villanos.add(villano);
    }
    
    @Override
    public double calcularSueldo() {
        return villanos.size() * COBRO_POR_VILLANO;
    }
    
    @Override
    public String toString() {
        String condicion;
        if(perteneceJL==true){
            condicion="Si";
        }else{
            condicion="No";
        }
        return super.toString() + "\n Es un: Heroe\n" + "Descripcion de Poder: " + descripcionPoder + "\ndescripcionDebilidad=" + descripcionDebilidad + 
                "\nPertenece a la LJ: " + condicion +"\nSueldo: "+ calcularSueldo();
    }
}
