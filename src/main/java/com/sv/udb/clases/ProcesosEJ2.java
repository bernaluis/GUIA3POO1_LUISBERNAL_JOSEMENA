/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.util.*;
import javax.swing.DefaultListModel;

/**
 *
 * @author vergo_000
 */
public class ProcesosEJ2 {

    List<DatosEJ2> lista;

    public ProcesosEJ2() {
        this.lista = new ArrayList<>();
    }

    public void agregar(int comb, String cliente) {
        this.lista.add(new DatosEJ2(comb, cliente));
    }

    public int[] total() {
        int[] total = new int[3];
        for (DatosEJ2 e : this.lista) {
            switch (e.getCombustible()) {
                case 1:
                    total[0] += 1;
                    break;
                case 2:
                    total[1] += 1;
                    break;
                case 3:
                    total[2] += 1;
                    break;
            }
        }
        return total;
    }

    public DefaultListModel listaDiesel() {
        DefaultListModel l1 = new DefaultListModel();
        for (DatosEJ2 d : this.lista) {
            if (d.getCombustible() == 1) {
                l1.addElement(d.getCliente());
            }
        }
        return l1;
    }

    public DefaultListModel listaRegular() {
        DefaultListModel l1 = new DefaultListModel();
        for (DatosEJ2 d : this.lista) {
            if (d.getCombustible() == 2) {
                l1.addElement(d.getCliente());
            }
        }
        return l1;
    }

    public DefaultListModel listaEspecial() {
        DefaultListModel l1 = new DefaultListModel();
        for (DatosEJ2 d : this.lista) {
            if (d.getCombustible() == 3) {
                l1.addElement(d.getCliente());
            }
        }
        return l1;
    }

}
