/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Eslover
 */
public class ManejadorPantallas {
    public static VPerfil pantallaPerfil;
    
    public static void abrirPantallaPerfil(){
        pantallaPerfil = new VPerfil();
        pantallaPerfil.setVisible(true);
        pantallaPerfil.setLocationRelativeTo(null);
    }
    
    public static void cerrarPantallaPerfil(){
        pantallaPerfil.setVisible(false);
        pantallaPerfil = null;
    }
}
