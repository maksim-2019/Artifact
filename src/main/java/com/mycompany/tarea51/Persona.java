/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea51;

/**
 *
 * @author maksim
 */
public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + '}';
    }
    
    public void saludarP(Persona perso){
        System.out.println("Hola" + perso.getNombre());
    }
}