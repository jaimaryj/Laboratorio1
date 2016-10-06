/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class MFeriado {
   private Date fecha;
   private String descripcion;
  

    

    public MFeriado(Date fecha, String descripcion) {
        this.fecha = fecha;
        this.descripcion = descripcion;
    }
   
   public MFeriado()
    {
        this.fecha=null;
        this.descripcion="";
        
                
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   
    
}
