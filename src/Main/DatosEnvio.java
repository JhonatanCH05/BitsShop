/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Jhonatan Cantero
 */
public class DatosEnvio {

    private String NombreCompleto;
    private String Identificacion;
    private int Telefono;
    private String E_mail;
    private String Pais;
    private String Ciudad;
    private String Direccion;
    DatosEnvio sig;

    public DatosEnvio(String NombreCompleto, String Identificacion, int Telefono, String E_mail, String Pais, String Ciudad, String Direccion) {
        this.NombreCompleto = NombreCompleto;
        this.Identificacion = Identificacion;
        this.Telefono = Telefono;
        this.E_mail = E_mail;
        this.Pais = Pais;
        this.Ciudad = Ciudad;
        this.Direccion = Direccion;
        this.sig = null;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getE_mail() {
        return E_mail;
    }

    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

}
