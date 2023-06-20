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
public class Producto {

    private String Nombre;
    private double PrecioAn;
    private double PrecioAc;
    private String imagen;
    private String info;
    Producto sig;

    public Producto(String Nombre, double PrecioAn, double PrecioAc, String imagen, String info) {
        this.Nombre = Nombre;
        this.PrecioAn = PrecioAn;
        this.PrecioAc = PrecioAc;
        this.imagen = imagen;
        this.info = info;
        this.sig = null;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecioAn() {
        return PrecioAn;
    }

    public void setPrecioAn(double PrecioAn) {
        this.PrecioAn = PrecioAn;
    }

    public double getPrecioAc() {
        return PrecioAc;
    }

    public void setPrecioAc(double PrecioAc) {
        this.PrecioAc = PrecioAc;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
