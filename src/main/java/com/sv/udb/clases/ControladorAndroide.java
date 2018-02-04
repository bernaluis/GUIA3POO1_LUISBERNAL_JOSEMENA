/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author samue
 */
public class ControladorAndroide {
    List<Androide> listAndroide;

    public ControladorAndroide() {
        this.listAndroide = new ArrayList<>();
    }
    
    public void agregarAndroide(Androide nombre, int vida)
    {
        Androide obj = new Androide();
        this.listAndroide.add(nombre);
    }
    
    public List<Androide> obtenerAndroide()
    {
        return this.listAndroide;
    }
    
    public List<Androide> ordenarDescendente() {
        Collections.sort(listAndroide, (a1, a2) -> {
            return (a1.getVida() < a2.getVida() ? -1
                    : (a1.getVida() == a2.getVida() ? 0 : 1));
        });
        return this.listAndroide;
    }
}
