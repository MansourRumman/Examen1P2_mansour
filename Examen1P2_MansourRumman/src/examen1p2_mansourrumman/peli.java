/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_mansourrumman;

import java.util.Date;

/**
 *
 * @author manso
 */
public class peli extends cont {
    private String dura;
    private Date cfec;
    private Date sfec;
    private String plot;

    public peli(String dura, Date cfec, Date sfec, String plot, String nombre) {
        super(nombre);
        this.dura = dura;
        this.cfec = cfec;
        this.sfec = sfec;
        this.plot = plot;
    }
    

    public String getDura() {
        return dura;
    }

    public void setDura(String dura) {
        this.dura = dura;
    }

    public Date getCfec() {
        return cfec;
    }

    public void setCfec(Date cfec) {
        this.cfec = cfec;
    }

    public Date getSfec() {
        return sfec;
    }

    public void setSfec(Date sfec) {
        this.sfec = sfec;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    @Override
    public String toString() {
        return "peli{" + "dura=" + dura + ", cfec=" + cfec + ", sfec=" + sfec + ", plot=" + plot + '}';
    }
    
}
