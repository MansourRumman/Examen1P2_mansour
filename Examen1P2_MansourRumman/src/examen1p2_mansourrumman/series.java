/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_mansourrumman;

/**
 *
 * @author manso
 */
public class series extends cont {
    private String temp;
    private String clase;
    private String est;
    private String act;

    public series(String temp, String clase, String est, String act, String nombre) {
        super(nombre);
        this.temp = temp;
        this.clase = clase;
        this.est = est;
        this.act = act;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    @Override
    public String toString() {
        return "series{" + "temp=" + temp + ", clase=" + clase + ", est=" + est + ", act=" + act + '}';
    }

    
     
}
