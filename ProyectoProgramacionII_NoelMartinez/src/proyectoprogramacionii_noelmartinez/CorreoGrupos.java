/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacionii_noelmartinez;

import java.io.Serializable;
import javax.swing.text.Style;
import javax.swing.text.StyledDocument;

/**
 *
 * @author noelg
 */
public class CorreoGrupos implements Serializable {
    private String paraGrupo;
    private String asuntoGrupo;
    private String contenidoGrupo;
    private StyledDocument documentoGrupo;
    private Style estiloGrupo;
    
    private static final long SerialVersionUID = 888L;

    public CorreoGrupos() {
    }

    public CorreoGrupos(String paraGrupo, String asuntoGrupo, String contenidoGrupo, StyledDocument documentoGrupo, Style estiloGrupo) {
        this.paraGrupo = paraGrupo;
        this.asuntoGrupo = asuntoGrupo;
        this.contenidoGrupo = contenidoGrupo;
        this.documentoGrupo = documentoGrupo;
        this.estiloGrupo = estiloGrupo;
    }

    public String getParaGrupo() {
        return paraGrupo;
    }

    public void setParaGrupo(String paraGrupo) {
        this.paraGrupo = paraGrupo;
    }

    public String getAsuntoGrupo() {
        return asuntoGrupo;
    }

    public void setAsuntoGrupo(String asuntoGrupo) {
        this.asuntoGrupo = asuntoGrupo;
    }

    public String getContenidoGrupo() {
        return contenidoGrupo;
    }

    public void setContenidoGrupo(String contenidoGrupo) {
        this.contenidoGrupo = contenidoGrupo;
    }

    public StyledDocument getDocumentoGrupo() {
        return documentoGrupo;
    }

    public void setDocumentoGrupo(StyledDocument documentoGrupo) {
        this.documentoGrupo = documentoGrupo;
    }

    public Style getEstiloGrupo() {
        return estiloGrupo;
    }

    public void setEstiloGrupo(Style estiloGrupo) {
        this.estiloGrupo = estiloGrupo;
    }

    @Override
    public String toString() {
        return "CorreoGrupos{" + "paraGrupo=" + paraGrupo + ", asuntoGrupo=" + asuntoGrupo + ", contenidoGrupo=" + contenidoGrupo + ", documentoGrupo=" + documentoGrupo + ", estiloGrupo=" + estiloGrupo + '}';
    }

   
    
    
}
