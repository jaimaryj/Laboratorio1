
package Modelo;

import java.util.Date;

public class MEntrevista {
    private
            String codigo;
            String descripcion;
            Date fecha;
            String identrevistador;
            String observacion;
            char modalidad;
            char calificacion;
            String codigoproyecto;
            Float salarioofertado;
            Float salariopretendido;
            String codigotipoentrevista;
            String codigocargo;
    public MEntrevista (String codigo,
                        String descripcion,
                        Date fecha,
                        String identrevistador,
                        String observacion,
                        char modalidad,
                        char calificacion,
                        String codigoproyecto,
                        Float salarioofertado,
                        Float salariopretendido,
                        String codigotipoentrevista,
                        String codigocargo){
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.fecha=fecha;
        this.identrevistador=identrevistador;
        this.observacion=observacion;
        this.modalidad=modalidad;
        this.calificacion=calificacion;
        this.codigoproyecto=codigoproyecto;
        this.salarioofertado=salarioofertado;
        this.salariopretendido=salariopretendido;
        this.codigotipoentrevista=codigotipoentrevista;
        this.codigocargo=codigocargo;
    }
//==========================================
    public MEntrevista() {
        this.codigo="";
        this.descripcion="";
        this.fecha=null;
        this.identrevistador="";
        this.observacion="";
        this.modalidad=' ';
        this.calificacion=' ';
        this.codigoproyecto="";
        this.salarioofertado=0.00f;
        this.salariopretendido=0.00f;
        this.codigotipoentrevista="";
        this.codigocargo="";
    }
//==========================================
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIdentrevistador() {
        return identrevistador;
    }

    public void setIdentrevistador(String identrevistador) {
        this.identrevistador = identrevistador;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public char getModalidad() {
        return modalidad;
    }

    public void setModalidad(char modalidad) {
        this.modalidad = modalidad;
    }

    public char getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(char calificacion) {
        this.calificacion = calificacion;
    }

    public String getCodigoproyecto() {
        return codigoproyecto;
    }

    public void setCodigoproyecto(String codigoproyecto) {
        this.codigoproyecto = codigoproyecto;
    }

    public Float getSalarioofertado() {
        return salarioofertado;
    }

    public void setSalarioofertado(Float salarioofertado) {
        this.salarioofertado = salarioofertado;
    }

    public Float getSalariopretendido() {
        return salariopretendido;
    }

    public void setSalariopretendido(Float salariopretendido) {
        this.salariopretendido = salariopretendido;
    }

    public String getCodigotipoentrevista() {
        return codigotipoentrevista;
    }

    public void setCodigotipoentrevista(String codigotipoentrevista) {
        this.codigotipoentrevista = codigotipoentrevista;
    }

    public String getCodigocargo() {
        return codigocargo;
    }

    public void setCodigocargo(String codigocargo) {
        this.codigocargo = codigocargo;
    }
}
