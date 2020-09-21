/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacionii_noelmartinez;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Style;
import javax.swing.text.StyledDocument;

/**
 *
 * @author noelg
 */
public class Correo implements Serializable {

    private String para;
    private String asunto;
    private String contenido;
    private StyledDocument documento;
    private Style estilo;

    private static final long SerialVersionUID = 777L;

    public Correo() {
    }

    public Correo(String para, String asunto, String contenido, StyledDocument documento, Style estilo) {
        this.para = para;
        this.asunto = asunto;
        this.contenido = contenido;
        this.documento = documento;
        this.estilo = estilo;
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

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public StyledDocument getDocumento() {
        return documento;
    }

    public void setDocumento(StyledDocument documento) {
        this.documento = documento;
    }

    public Style getEstilo() {
        return estilo;
    }

    public void setEstilo(Style estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Correo " + "para=" + para + ", asunto=" + asunto + ", contenido=" + contenido + ", documento=" + documento + ", estilo=" + estilo;
    }

}
