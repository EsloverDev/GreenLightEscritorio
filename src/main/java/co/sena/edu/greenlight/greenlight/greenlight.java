/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.sena.edu.greenlight.greenlight;

import controlador.Conection;
import vista.ManejadorPantallas;

/**
 *
 * @author Eslover
 */
public class greenlight {
    public static void main(String[] args){
        Conection.conectar();
        
        ManejadorPantallas.abrirPantallaPerfil();
    }
}
