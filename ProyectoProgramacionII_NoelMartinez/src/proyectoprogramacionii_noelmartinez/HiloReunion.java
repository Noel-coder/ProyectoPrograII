/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacionii_noelmartinez;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author noelg
 */
public class HiloReunion implements Runnable {

    ArrayList<Reunion> listadeReuniones = new ArrayList();
    File BinarioReunion = null;
    private static final long SerialVersionUID = 777L;

    public HiloReunion() {
    }
    
    public HiloReunion(String ruta) {
        BinarioReunion = new File(ruta);
    }
    
    @Override
    public void run() {
        while (true) {            
            Date d = new Date();
            DateFormat hr = new SimpleDateFormat("hh:mm a");
            DateFormat dia = new SimpleDateFormat("d/M/yy");
            String hora = hr.format(d);
            String fecha = dia.format(d);
            CargarReunion();
            if (Validacion(fecha,hora)) {
                JOptionPane.showMessageDialog(null,"¡TIENES UNA REUNION!");
            }
            try {
                Thread.sleep(60);
            } catch (InterruptedException e) {
            }
            
        }
    }
    public void CargarReunion(){
        try {
            listadeReuniones = new ArrayList();
            Reunion temp;
            if (BinarioReunion.exists()) {
                FileInputStream entrada = new FileInputStream(BinarioReunion);
                ObjectInputStream obj = new ObjectInputStream(entrada);
                try {
                    while ((temp=(Reunion)obj.readObject())!= null) {                        
                        listadeReuniones.add(temp);
                    }
                } catch (Exception e) {
                }
                obj.close();
                entrada.close();
            }
        } catch (IOException e) {
        }
        

    }
    public boolean Validacion(String fecha, String hora){
        for (int i = 0; i < listadeReuniones.size(); i++) {
            Date diaGuardado = listadeReuniones.get(i).getInicio();
            DateFormat diaformato = new SimpleDateFormat("dd/MM/yy");
            String fecha2 = diaformato.format(diaGuardado);
            if (fecha2.equals(fecha)) {
                if (listadeReuniones.get(i).getIniciatiempo().equals(hora)) {
                    return true;
                }
            }
        }
        return false;
    }
    
}
