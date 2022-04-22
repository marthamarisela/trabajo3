/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actor;

/**
 *
 * @author Asus
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var actor=new Actor();
        actor.setNombre("will Smith");
        actor.setYearNacimiento(1968);
        actor.setListaPersonaje("Escuadron suicida");
        System.out.println("El  actor se llama:  "  +actor.getNombre()
                +"su fecha de nacimiento es :" 
                +actor.getYearNacimiento()+"sus personajes son:"   
                +actor.getListaPersonaje()+"y tiene"+actor.calcularEdad());
      
       
        var pelicula=new Pelicula();
        pelicula.setDuracion(2);
        pelicula.setGenero("terror");
        pelicula.setRestriccion("Si");
        System.out.println("la pelicula tiene  duracion de :  "   +pelicula.getDuracion()
                +  "horas"   +"y su genero es de :"+pelicula.getGenero()  
                +"tiene restriccion:"    +pelicula.getRestriccion()+"y"+pelicula.tieneRestriccion());
       
         
    }
    
}
