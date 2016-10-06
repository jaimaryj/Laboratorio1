/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Libreria.Rutinas;
import Modelo.ClassConexionDAO;
import Modelo.MFeriado;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class DaoFeriado extends ClassConexionDAO{
    
    public void insertFeriado(MFeriado mf){
        
        String sql;
        sql="INSERT INTO feriado(fecha, descripcion, estatus) VALUES (";
        sql=sql + Rutinas.Apost(mf.getFecha().toString()) + ",";
        sql=sql + Rutinas.Apost(mf.getDescripcion()) + ",";
        sql=sql + "'F')";
        
        PackageConeccion.ConeccionBD.ejecutar(sql);
        
        
        
    }
    
    public void modificarFeriado(MFeriado mf){
      String sql;
       sql=" UPDATE feriado SET descripcion=";
       sql= sql + Rutinas.Apost(mf.getDescripcion());  
       sql= sql + " WHERE fecha=" + Rutinas.Apost(mf.getFecha().toString());
       
       PackageConeccion.ConeccionBD.ejecutar(sql);
    }
    
    public void eliminarFeriado(MFeriado mf){
        
       String sql;
       
       sql=" UPDATE feriado SET estatus= 'S'" ;
      
       sql= sql + " WHERE fecha=" + Rutinas.Apost(mf.getFecha().toString());
       
       PackageConeccion.ConeccionBD.ejecutar(sql);
        
    }
    
    public ResultSet buscarFeriado(Date fecha){
        
        ResultSet regferiado;
        
        String sql;
        
        sql = "Select * from feriado Where fecha=";
        sql = sql + Rutinas.Apost(fecha.toString())+"";
        
        regferiado = PackageConeccion.ConeccionBD.consultar(sql);
        
        return regferiado;     
    }
    
}
