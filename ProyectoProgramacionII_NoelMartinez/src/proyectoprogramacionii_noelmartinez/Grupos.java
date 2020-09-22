/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacionii_noelmartinez;

import java.io.Serializable;

/**
 *
 * @author noelg
 */
public class Grupos implements Serializable {

    private String nombre;
    private String descripcion;

    private static final long SerialVersionUID = 777L;

    public Grupos(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Grupos{" + "nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

}
