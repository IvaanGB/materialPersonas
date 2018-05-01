package com.ivaangb.material.material;

import java.util.ArrayList;

/**
 * Created by ivang on 30/4/2018.
 */

public class Datos {
    private static ArrayList<Persona> personas = new ArrayList();

    public static void guardar(Persona p){
        personas.add(p);
    }

    public static ArrayList<Persona> obtener(){
        return personas;
    }


}
