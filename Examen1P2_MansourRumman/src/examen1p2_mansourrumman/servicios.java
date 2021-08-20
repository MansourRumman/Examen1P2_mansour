/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_mansourrumman;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author manso
 */
public class servicios {
    private String nombre;
    private String precio;
    private String cal;
    private Date fecha;
    private String dueno;
    private ArrayList<cont> con=new ArrayList();

    servicios(String nombre, String precio, String cal, Date fecha, String dueno) {
          this.nombre = nombre;
        this.precio = precio;
        this.cal = cal;
        this.fecha = fecha;
        this.dueno = dueno;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCal() {
        return cal;
    }

    public void setCal(String cal) {
        this.cal = cal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public ArrayList getCon() {
        return con;
    }

    public void setCon(ArrayList con) {
        this.con = con;
    }
    

    @Override
    public String toString() {
        return "servicios{" + "nombre=" + nombre + ", precio=" + precio + ", cal=" + cal + ", fecha=" + fecha + ", dueno=" + dueno + '}';
    }
    
}
