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
public class persona implements Serializable{
    private String usuario,contraseña;
    private String correo;
    
    private static final long SerialVersionUID=777L;

    public persona(String usuario, String contraseña, String correo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.correo = correo;
    }



    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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
        return "persona{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", correo=" + correo + '}';
    }

   
    
    
    
    
}
