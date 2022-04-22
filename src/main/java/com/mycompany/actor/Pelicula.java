/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actor;

import java.util.Date;

/**
 *
 * @author Asus
 */
public class Pelicula {
    private int duracion;
    private String genero;
    private String   restriccion;
    
     public boolean tieneRestriccion(){
        var retorno=false;
        if(this.restriccion == "Si")
            return true;
        if (this.restriccion == "No")
            return  false;
      return retorno;
        
     
     }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRestriccion() {
        return restriccion;
    }

    public void setRestriccion(String restriccion) {
        this.restriccion = restriccion;
    }
    
}
