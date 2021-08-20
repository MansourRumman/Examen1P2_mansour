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
public class mini extends cont {
    private String temp;
    private String gen;
    private String dur;
    private String descrip;

    public mini(String temp, String gen, String dur, String descrip, String nombre) {
        super(nombre);
        this.temp = temp;
        this.gen = gen;
        this.dur = dur;
        this.descrip = descrip;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getDur() {
        return dur;
    }

    public void setDur(String dur) {
        this.dur = dur;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    @Override
    public String toString() {
        return "mini{" + "temp=" + temp + ", gen=" + gen + ", dur=" + dur + ", descrip=" + descrip + '}';
    }
    
}
