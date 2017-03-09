/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas;


public class Romano {

    private String escudo,arma,rango,faccion;
    

    public boolean setEscudo(String escudo){
        if (!escudo.isEmpty()){
            this.escudo = escudo;
            return true;
        } else return false;
    }
    
        public boolean setArma(String arma){
        if (!arma.isEmpty()){
            this.arma = arma;
            return true;
        } else return false;
    }
       

    public boolean setRango(String rango){
        if (!rango.isEmpty()){
            this.rango = rango;
            return true;
        } else return false;
    }
    
        public boolean setFaccion(String faccion){
        if (!faccion.isEmpty()){
            this.faccion = faccion;
            return true;
        } else return false;
    }


    public String getEscudo(){  return escudo; }
    public String getRango()  {  return rango;   }
    public String getArma(){  return arma; }
    public String getFaccion(){  return faccion; }

}
