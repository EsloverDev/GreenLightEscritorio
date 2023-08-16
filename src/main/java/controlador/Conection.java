/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Eslover
 */
public class Conection {
    private static Connection conect;
    final static String user = "root";
    final static String pass = "05226.Eslover";
    final static String url = "jdbc:mysql://localhost:3306/greenlightdb"+"?serverTimeZone = UTC"+"&useSSL=false";
    
    public static void conectar(){
        try {
            conect = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Conexión exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fracasó la conexión");
        }
    }

    public static Connection getConect() {
        return conect;
    }
    
}
