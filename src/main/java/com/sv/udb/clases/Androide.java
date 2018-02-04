/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

/**
 * 
 * @author samue
 */
public class Androide {
    private String sNombre;
    private int vida = 100;

    public Androide() {
    }

    public Androide(String sNombre, int vida) {
        this.sNombre = sNombre;
        this.vida = vida;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    
    @Override
    public String toString() {
        return this.sNombre;
    }
            
}
