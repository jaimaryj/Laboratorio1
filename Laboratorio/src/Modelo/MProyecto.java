
package Modelo;

import java.util.Date;

public class MProyecto 
{
    private 
            String codigo;
            String descripcion;
            Date fechainicio;
            Date fechafin;
    public  MProyecto(String codigo,
                      String descripcion,
                      Date fechainicio,
                      Date fechafin)
    {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
    }
    public MProyecto()
    {
        this.codigo = "";
        this.descripcion = "";
        this.fechainicio = null;
        this.fechafin = null;
    }        
//========================================
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }
}
