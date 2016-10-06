
package Modelo;

/**
 *
 * @author Valmore Canelon
 */
public class MCliente {
    private
            String codigo;
            String razonsocial;
            String nacionalidad;
            String estado_provincia;
            String telefono;
            String correo;
            char estatus;


public MCliente(String codigo,
                String razonsocial,
                String nacionalidad,
                String estado_provincia,
                String telefono,
                String correo,
                char estatus)
{
    this.codigo = codigo;
    this.razonsocial = razonsocial;
    this.nacionalidad = nacionalidad;
    this.estado_provincia = estado_provincia;
    this.telefono = telefono;
    this.correo = correo;
    this.estatus = estatus;
}

    public MCliente()
    {
    this.codigo = "";
    this.razonsocial = "";
    this.nacionalidad = "";
    this.estado_provincia = "";
    this.telefono = "";
    this.correo = "";
    this.estatus = ' ';
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEstado_provincia() {
        return estado_provincia;
    }

    public void setEstado_provincia(String estado_provincia) {
        this.estado_provincia = estado_provincia;
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

    public char getEstatus() {
        return estatus;
    }

    public void setEstatus(char estatus) {
        this.estatus = estatus;
    }

}