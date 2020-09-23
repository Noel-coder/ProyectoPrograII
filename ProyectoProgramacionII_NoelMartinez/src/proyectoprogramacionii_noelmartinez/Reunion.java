/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacionii_noelmartinez;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author noelg
 */
public class Reunion implements Serializable {
    private String para;
    private String asunto;
    private String ubicacion;
    private Date inicio;
    private Date finalizacion;
    private String iniciatiempo;
    private String finalizatiempo;

    public Reunion() {
    }

    public Reunion(String asunto, String ubicacion, Date inicio, Date finalizacion, String iniciatiempo, String finalizatiempo) {
        this.asunto = asunto;
        this.ubicacion = ubicacion;
        this.inicio = inicio;
        this.finalizacion = finalizacion;
        this.iniciatiempo = iniciatiempo;
        this.finalizatiempo = finalizatiempo;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFinalizacion() {
        return finalizacion;
    }

    public void setFinalizacion(Date finalizacion) {
        this.finalizacion = finalizacion;
    }

    public String getIniciatiempo() {
        return iniciatiempo;
    }

    public void setIniciatiempo(String iniciatiempo) {
        this.iniciatiempo = iniciatiempo;
    }

    public String getFinalizatiempo() {
        return finalizatiempo;
    }

    public void setFinalizatiempo(String finalizatiempo) {
        this.finalizatiempo = finalizatiempo;
    }

    @Override
    public String toString() {
        return "Reunion{" + "para=" + para + ", asunto=" + asunto + ", ubicacion=" + ubicacion + ", inicio=" + inicio + ", finalizacion=" + finalizacion + ", iniciatiempo=" + iniciatiempo + ", finalizatiempo=" + finalizatiempo + '}';
    }
    
}
