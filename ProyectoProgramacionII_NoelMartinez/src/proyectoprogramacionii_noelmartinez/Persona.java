/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacionii_noelmartinez;

import java.io.Serializable;
import javax.swing.Icon;

/**
 *
 * @author noelg
 */
public class Persona implements Serializable{
    private String usuario,contraseña,correo;
    
    private static final long SerialVersionUID=777L;

    public Persona() {
    }

    public Persona(String Usuario, String contraseña, String correo) {
        this.usuario = Usuario;
        this.contraseña = contraseña;
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String Usuario) {
        this.usuario = Usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona{" + "Usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", correo=" + correo + '}';
    }

    
    
}
