package com.ivaangb.material.material;

import java.util.ArrayList;
import java.util.Random;

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

    public static int fotoAleatoria(ArrayList<Integer> fotos){
        int fotoSeleccionada;

        Random r = new Random();

        fotoSeleccionada = r.nextInt(fotos.size());

        return fotos.get(fotoSeleccionada);

    }


}
