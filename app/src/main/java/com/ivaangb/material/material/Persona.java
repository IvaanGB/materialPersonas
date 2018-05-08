package com.ivaangb.material.material;

/**
 * Created by ivang on 30/4/2018.
 */

public class Persona {
    private String cedula, nombre, apellido;
    private int sexo;

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    private int foto;

    public Persona(String cedula, String nombre, String apellido, int sexo, int foto) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.foto = foto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSexo() {
        return sexo;
    }


    public void setSexo(int sexo) {
        this.sexo = sexo;
    }


    public void guardar(){
        Datos.guardar(this);
    }

}
