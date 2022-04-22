/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actor;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class Actor {
    private String nombre;
    private String listaPersonaje;
    private int yearNacimiento;
    
       public int calcularEdad(){
        return LocalDate.now().getYear()-this.yearNacimiento;

    
    
    
    
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getListaPersonaje() {
        return listaPersonaje;
    }

    public void setListaPersonaje(String listaPersonaje) {
        this.listaPersonaje = listaPersonaje;
    }

    public int getYearNacimiento() {
        return yearNacimiento;
    }

    public void setYearNacimiento(int yearNacimiento) {
        this.yearNacimiento = yearNacimiento;
    }
}