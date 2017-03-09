/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.basicos;

import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;

/**
 *
 * @author Dixven
 */
public class Monedero {
    
    Moneda c1 = new Moneda();
    Pizarra x = new Pizarra();



    public void inicio() {
        System.out.println("Para calcular el valor del monedero");
    }
    
     Moneda moneda[] = new Moneda[25];
    double [] numMon =new double[25];
    int cuenta=0;
    double total;
    
    
    boolean isNum(String cad) {
        Dialog d = new Dialog();
        try {
            Double.parseDouble(cad);
            return true;
        } catch (NumberFormatException nfe) {
            d.display("solo se admiten valores numericos");
        }
        return false;
    }


    public void datos(Moneda y) {
        Dialog d = new Dialog();
        String aux,valor,escudo,divisa;

        do aux = d.readString("Ingrese el Pais de la Moneda:");
        while (aux.isEmpty());
        y.setPais(aux);
        
        String c = "" ;
             
         while (! ( c ).equalsIgnoreCase( "stop" )) { //this initializes the name variable and sentinel stop
            do aux = d.readString("Ingrese la divisa de la moneda, o entra stop para terminar:");
            while (aux.isEmpty());
            divisa = aux;
            
            
            c = aux;
             if ((c).equalsIgnoreCase("stop")){
               
                break;
             }
            do aux = d.readString("\n Ingrese el numero de monedas: \n");
            while (!isNum(aux));
            double q = ((Double.parseDouble(aux)));
            numMon[cuenta]=q;
            
            do valor = d.readString("\n Ingrese el valor de la moneda: \n");
            while (!isNum(valor));
            double va=(Double.parseDouble(valor));
            
            do aux = d.readString("Ingrese el escudo de la moneda:");
            while (aux.isEmpty());
            escudo = aux;
          
           
            moneda[cuenta]=new Moneda();
            moneda[cuenta].setValor(va);
            moneda[cuenta].setEscudo(escudo);
            moneda[cuenta].setDivisa(divisa);
            
            cuenta++;
      
            
            
        }

    }

    public void calculos() {

     for (int i = 0; i < cuenta; i++) {
            total = total + moneda[i].getValor() * numMon[i];
        }
    
    }    


    void resultados() { //No. 3 Imprimir
        x.setVisible(true);
         String pais = (String) c1.getPais ();
         String divisa = (String) c1.getDivisa ();
        
        x.out("\nPais: "+pais);
       for (int i = 0; i < cuenta; i++) {
            x.out("\nNumero de Monedas: " + numMon[i]);
            x.out("\nValor: " + moneda[i].getValor());
            x.out("\nEscudo: " + moneda[i].getEscudo());
            x.out("\nDivisa: " + moneda[i].getDivisa());
        }
       x.out("\nTotal: " + total);
    }   

    public static void main(String[] args) throws IOException {
        Monedero a = new Monedero ();
        String resp = "s";


        a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.c1);
            a.calculos();
            a.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otro monedero? s/n");
            System.in.skip(2);
        }
    }
}
    

