/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.basicos;


public class Moneda {
    
    
    private double valor;
    private String escudo, pais, divisa;
    private int año;

    public boolean setValor(double v){
        if (v > 0){
            valor = v;
            return true;
        } else return false;
    }

    public boolean setEscudo(String e){
        if (!e.isEmpty()){
            escudo = e;
            return true;
        } else return false;
    }

    public boolean setPais(String p){
        if (!p.isEmpty()){
            pais = p;
            return true;
        } else return false;
    }

    public boolean setDivisa(String d){
        if (!d.isEmpty()){
            divisa = d;
            return true;
        } else return false;
    }

    public boolean setAño(int a){
        if (a > 0){
            año = a;
            return true;
        } else return false;
    }

    public double getValor() {  return valor;  }
    public String getEscudo(){  return escudo; }
    public String getPais()  {  return pais;   }
    public String getDivisa(){  return divisa; }
    public int getAño()      {  return año;    }
}
    
