package com.company.entradaSalida;

import com.company.dto.Comercial;
import com.company.dto.Empleado;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Escritura {

    public void escribir(){
        FileOutputStream fileOutputStream;
        ObjectOutputStream salida;
        Empleado e1 = new Empleado(100,"Carlos","chc@gmail.com","666000666");
        Empleado c2 = new Comercial(101,"Jose", "coro@gmail.con","3043403543",1,5 );

        try {
            fileOutputStream = new FileOutputStream("prueba2.dat",true);
            salida = new ObjectOutputStream(fileOutputStream);
            salida.writeObject(e1);
            salida.writeObject(c2);
            salida.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
