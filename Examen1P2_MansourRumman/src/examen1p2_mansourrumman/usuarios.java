/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_mansourrumman;

import java.util.ArrayList;

/**
 *
 * @author manso
 */
public class usuarios {
    private String nomb;
    private String apel;
    private String cor;
    private String tel;
    private String plan;
    private String nu;
    private String pass;

    public usuarios(String nomb, String apel, String cor, String tel, String plan, String nu, String pass) {
        this.nomb = nomb;
        this.apel = apel;
        this.cor = cor;
        this.tel = tel;
        this.plan = plan;
        this.nu = nu;
        this.pass = pass;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public String getApel() {
        return apel;
    }

    public void setApel(String apel) {
        this.apel = apel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getNu() {
        return nu;
    }

    public void setNu(String nu) {
        this.nu = nu;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "usuarios{" + "nomb=" + nomb + ", apel=" + apel + ", cor=" + cor + ", tel=" + tel + ", plan=" + plan + ", nu=" + nu + ", pass=" + pass + '}';
    }

    
}
