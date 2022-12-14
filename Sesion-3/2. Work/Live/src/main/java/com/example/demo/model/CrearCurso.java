package com.example.demo.model;

public class CrearCurso {
    private String nombre;

    private CrearCurso(){
    }

    public CrearCurso(String nombre){
        this();
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
