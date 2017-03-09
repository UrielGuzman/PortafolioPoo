/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas;

import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;

/**
 *
 * @author Dixven
 */
public class RomanoPrueba {
    
    
    Romano c1 = new Romano();
    Pizarra x = new Pizarra();

    int cuenta = 0;


    public void inicio() {
        System.out.println("Para modificar varios romanos");
    }
    
     Romano romano[] = new Romano[25];
   

    public void datos(Romano y) {
        Dialog d = new Dialog();
        String aux,escudo,arma,faccion,rango;
        
        String c = "" ;
             
         while (! ( c ).equalsIgnoreCase( "stop" )) { //this initializes the name variable and sentinel stop
            do aux = d.readString("Ingrese faccion a la que pertenece, "
                    + "o entra stop para terminar:");
            while (aux.isEmpty());
            faccion = aux;
            
            
            c = aux;
             if ((c).equalsIgnoreCase("stop")){
               
                break;
             }
            
            do aux = d.readString("Ingrese el rango que tiene el romano:");
            while (aux.isEmpty());
            rango = aux;
            
            do aux = d.readString("Ingrese el arma que usa el romano:");
            while (aux.isEmpty());
            arma = aux;
            
            do aux = d.readString("Ingrese el escudo por el que pelea el romano:");
            while (aux.isEmpty());
            escudo = aux;
          
           
            romano[cuenta]=new Romano();
            romano[cuenta].setFaccion(faccion);
            romano[cuenta].setEscudo(escudo);
            romano[cuenta].setArma(arma);
            romano[cuenta].setRango(rango);
            
            cuenta++;
      
            
            
        }

    }

    public void calculos() //No hay calculos  
    {}

    void resultados() { //No. 3 Imprimir
        x.setVisible(true);
 
       for (int i = 0; i < cuenta; i++) {
            x.out("El romano");
            x.out("\nEs de la faccion: " + romano[i].getFaccion());
            x.out("\nSu rango militar es: " + romano[i].getRango());
            x.out("\nUsa el arma: " + romano[i].getArma());
            x.out("\nPelea por el escudo: " + romano[i].getEscudo());
        }
    }   

    public static void main(String[] args) throws IOException {
        RomanoPrueba a = new RomanoPrueba ();
        String resp = "s";


        a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.c1);
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea ingresar mas romanos? s/n");
            System.in.skip(2);
        }
    }
}
