package com.company.dto;

public class Comercial extends Empleado{

    private int numeroVentas;
    private int escalafon;

    public Comercial(int id, String nombre, String email, String telefono, int numeroVentas, int escalafon) {
        super(id, nombre, email, telefono);
        this.numeroVentas = numeroVentas;
        this.escalafon = escalafon;
    }

    public int getNumeroVentas() {
        return numeroVentas;
    }

    public void setNumeroVentas(int numeroVentas) {
        this.numeroVentas = numeroVentas;
    }

    public int getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(int escalafon) {
        this.escalafon = escalafon;
    }
}
