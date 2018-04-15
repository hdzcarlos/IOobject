package com.company;

import com.company.dto.Comercial;
import com.company.dto.Empleado;
import com.company.entradaSalida.Escritura;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {


    public static void main(String[] args) {



        Escritura escritura = new Escritura();
        Lectura lectura = new Lectura();
        escritura.escribir();
        lectura.lecturas();

    }
}