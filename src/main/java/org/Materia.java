package org.example;

import java.util.List;


public class Materia
{
    private String nombre;
    private List<Materia> correlativas;

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public Materia(String nombre, List<Materia> correlativa){};

    public Boolean tieneCorrelativa(Materia materia){
       return this.correlativas.contains(materia);
    }


}