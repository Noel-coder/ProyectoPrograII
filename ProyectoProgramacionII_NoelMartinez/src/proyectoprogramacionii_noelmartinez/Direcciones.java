/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacionii_noelmartinez;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author noelg
 */
public class Direcciones {

    public DefaultTableModel buscarPersonas(String buscar)  {
        Dba db = new Dba("./ProyectoProgramacionII.accdb");
        db.conectar();

        String[] nombresColumnas = {"Usuario", "Correo", "Genero"};//Indica el nombre de las columnas en la tabla

        String[] registros = new String[4];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        try {
            db.query.execute("SELECT * FROM Registro WHERE Usuario LIKE '%" + buscar + "%' OR Correo LIKE '%" + buscar + "%'");
        } catch (SQLException ex) {
            Logger.getLogger(Direcciones.class.getName()).log(Level.SEVERE, null, ex);
        }

        Connection cn = null;

        ResultSet rs = null;

        try {

            rs = db.query.getResultSet();
            while (rs.next()) {

                registros[0] = rs.getString("Usuario");

                registros[1] = rs.getString("Correo");

                registros[2] = rs.getString("Genero");

                modelo.addRow(registros);


            }
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al conectar. " + e.getMessage());

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }

                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return modelo;
    }
}
