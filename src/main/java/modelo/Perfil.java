/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Eslover
 */
public class Perfil {
    int perfil_Id;
    String nombre;
    String password;
    String email;
    String telefono;
    String Pais;
    String ciudad;
    String localidad;
    String documento;

    public Perfil() {
    }

    public Perfil(int perfil_Id, String nombre, String password, String email, String telefono, String Pais, String ciudad, String localidad, String documento) {
        this.perfil_Id = perfil_Id;
        this.nombre = nombre;
        this.password = password;
        this.email = email;
        this.telefono = telefono;
        this.Pais = Pais;
        this.ciudad = ciudad;
        this.localidad = localidad;
        this.documento = documento;
    }

    public int getPerfil_Id() {
        return perfil_Id;
    }

    public void setPerfil_Id(int perfil_Id) {
        this.perfil_Id = perfil_Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Perfil{" + "perfil_Id=" + perfil_Id + ", nombre=" + nombre + ", password=" + password + ", email=" + email + ", telefono=" + telefono + ", Pais=" + Pais + ", ciudad=" + ciudad + ", localidad=" + localidad + ", documento=" + documento + '}';
    }
    
}
