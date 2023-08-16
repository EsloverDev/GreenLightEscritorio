/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Perfil;

/**
 *
 * @author Eslover
 */
public class CPerfil {
    
    public void registrarPerfil(Perfil p){
        try {
            Statement st = Conection.getConect().createStatement();
            st.execute("insert into perfilesprueba values ('"+p.getPerfil_Id()+"','"+p.getNombre()+"','"+p.getPassword()+"','"+p.getEmail()+"','"+p.getTelefono()+"','"+p.getPais()+"','"+p.getCiudad()+"','"+p.getLocalidad()+"','"+p.getDocumento()+"');");
            JOptionPane.showMessageDialog(null, "Registrado");
        } catch (Exception ex) {
            Logger.getLogger(CPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet consultarPerfil(){
        ResultSet rs = null;
        try {
            Statement st = Conection.getConect().createStatement();
            rs = st.executeQuery("select * from perfilesprueba");
        } catch (Exception ex) {
            Logger.getLogger(CPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet consultarPerfilId(int perfil_Id){
        ResultSet rs = null;
        try {
            Statement st = Conection.getConect().createStatement();
            rs = st.executeQuery("select * from perfilesprueba where perfil_Id = '"+perfil_Id+"';");
        } catch (SQLException ex) {
            Logger.getLogger(CPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public void actualizarPerfil(Perfil p){
        try {
            Statement st = Conection.getConect().createStatement();
            st.execute("update perfilesprueba set nombre = '"+p.getNombre()+"', password = '"+p.getPassword()+"', email = '"+p.getEmail()+"', telefono = '"+p.getTelefono()+"', pais = '"+p.getPais()+"', ciudad = '"+p.getCiudad()+"', localidad = '"+p.getLocalidad()+"', documento = '"+p.getDocumento()+"' where perfil_Id = '"+p.getPerfil_Id()+"';");
        } catch (SQLException ex) {
            Logger.getLogger(CPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarPerfil(int perfil_Id){
        try {
            Statement st = Conection.getConect().createStatement();
            st.execute("delete from perfilesprueba where perfil_Id = '"+perfil_Id+"';");
            JOptionPane.showMessageDialog(null, "Eliminado");
        } catch (SQLException ex) {
            Logger.getLogger(CPerfil.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No eliminado");
        }
    }
    
    public void rellenar(JTable tabla, ResultSet rs){
        String[] titles = new String[]{"Id", "Nombre", "Contraseña", "E-mail", "Telefono", "Pais", "Ciudad", "Localidad", "Documento"};
        DefaultTableModel tablaPorDefecto = new DefaultTableModel(titles, 0);
        /*DefaultTableModel tablaPorDefecto = new DefaultTableModel();
        tablaPorDefecto.addColumn("Id");
        tablaPorDefecto.addColumn("Nombre");
        tablaPorDefecto.addColumn("Contraseña");
        tablaPorDefecto.addColumn("E-mail");
        tablaPorDefecto.addColumn("Telefono");
        tablaPorDefecto.addColumn("Pais");
        tablaPorDefecto.addColumn("Ciudad");
        tablaPorDefecto.addColumn("Localidad");
        tablaPorDefecto.addColumn("Documento");*/
        try {
            while(rs.next()){
                String[] fila = {rs.getString("perfil_Id"), rs.getString("nombre"), rs.getString("password"), rs.getString("email"), rs.getString("telefono"), rs.getString("pais"), rs.getString("ciudad"), rs.getString("localidad"), rs.getString("documento")};
                tablaPorDefecto.addRow(fila);
            }
            tabla.setModel(tablaPorDefecto);
        } catch (SQLException ex) {
            Logger.getLogger(CPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
