/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

/**
 *
 * @author vergo_000
 */
public class DatosEJ2 {

    private int combustible;
    private String cliente;

    public DatosEJ2() {
    }

    public DatosEJ2(int combustible, String cliente) {
        this.combustible = combustible;
        this.cliente = cliente;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

}
