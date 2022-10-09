/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tuto.entidades;

import java.util.List;
import mx.itson.frankie.enumeradores.Tipo;

/**
 * Se asignan las variables que contendrá el tutorial
 * 
 */
public class Tutorial {

   

    private String nombre;
    private String descripción;
    private List<Herramienta> herramientas;
    private List<Paso> pasos;
    private Tipo uso;
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripción
     */
    public String getDescripción() {
        return descripción;
    }

    /**
     * @param descripción the descripción to set
     */
    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    /**
     * @return the herramientas
     */
    public List<Herramienta> getHerramientas(int i) {
        return herramientas;
    }

    /**
     * @param herramientas the herramientas to set
     */
    public void setHerramientas(List<Herramienta> herramientas) {
        this.herramientas = herramientas;
    }

    /**
     * @return the pasos
     */
    public List<Paso> getPasos() {
        return pasos;
    }

    /**
     * @param pasos the pasos to set
     */
    public void setPasos(List<Paso> pasos) {
        this.pasos = pasos;
    }
     
     /**
     * @return the uso
     */
    public Tipo getUso() {
        return uso;
    }

    /**
     * @param uso the uso to set
     */
    public void setUso(Tipo uso) {
        this.uso = uso;
    }
    
}
