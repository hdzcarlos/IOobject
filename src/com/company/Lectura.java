package com.company;


import com.company.dto.Empleado;

import java.io.*;

public class Lectura {

    public void lecturas(){
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        try{
            fileInputStream = new FileInputStream("prueba2.dat");
            objectInputStream = new ObjectInputStream(fileInputStream);
            while (true ) {

            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (StreamCorruptedException e){
            e.printStackTrace();
        } catch(IOException e ){
            e.printStackTrace();
        }
    }

}
