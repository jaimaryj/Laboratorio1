/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class MCandidato 
{
   private 
          String identificador;
          String nombre;
          String apellido;
          String telefono;
          String correo;
          String cualidades;
          String curriculum;
          String nacionalidad;
          String estadoProvincia;

    public MCandidato(String identificador, 
                      String nombre, 
                      String apellido, 
                      String telefono, 
                      String correo, 
                      String cualidades, 
                      String curriculum, 
                      String nacionalidad, 
                      String estadoProvincia) 
    {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.cualidades = cualidades;
        this.curriculum = curriculum;
        this.nacionalidad = nacionalidad;
        this.estadoProvincia = estadoProvincia;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCualidades() {
        return cualidades;
    }

    public void setCualidades(String cualidades) {
        this.cualidades = cualidades;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEstadoProvincia() {
        return estadoProvincia;
    }

    public void setEstadoProvincia(String estadoProvincia) {
        this.estadoProvincia = estadoProvincia;
    }
 
    
    
    
    
    
    
    }

