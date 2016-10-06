/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
 import java.util.Date;

/**
 *
 * @author franc_000
 */
public class MNomina 
{
     private 
        String codNomina;
        int nroHoras;
        Date fechaPago;
        
    
     public MNomina (String codNomina,
                     int nroHoras,
                     Date fechaPago
                     )
        
     {
        this.codNomina = codNomina;
        this.nroHoras = nroHoras;
        this.fechaPago = fechaPago;
        
      }
     
   //----------------------------------------
     
      public MNomina() 
    {
        this.codNomina = "";
        this.nroHoras = 0;
        // this.fechaPago =  ;
        
        
    }
          
//------------------------- 
        
    public String getCodNomina() 
    {
        return codNomina;
    }

    public void setCodNomina(String codNomina) 
    {
        this.codNomina = codNomina;
    }

    public int getNroHoras() 
    {
        return nroHoras;
    }

    public void setNroHoras(int nroHoras) 
    {
        this.nroHoras = nroHoras;
    }

    public Date getFechaPago() 
    {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) 
    {
        this.fechaPago = fechaPago;
    }
    
    }
        
        
     
  