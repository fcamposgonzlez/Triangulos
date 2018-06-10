/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import Product.Celda;
import Product.Pascal;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author dms
 */
public class Diagonales extends Decorador {
    
    
    public Diagonales(Pascal pascal){
        this.pascal = pascal;
    }
    
    public void mostrarDiagonales(){
        ArrayList estructura = pascal.getEstructura();
            for(int fil = 0;fil < estructura.size(); fil++){
                for(int cas = 0;cas < 4;cas++){
                    ArrayList larg = (ArrayList) estructura.get(fil);
                    if(cas < larg.size()){
                        if(cas == 0){
                            System.out.println("Fila: " + fil + "Casilla: " + cas);
                            ArrayList fila = (ArrayList) estructura.get(fil);
                            Celda casilla = (Celda) fila.get(cas);
                            casilla.setColor(Color.magenta);
                        }
                        if(cas == 1){
                            System.out.println("Fila: " + fil + "Casilla: " + cas);
                            ArrayList fila = (ArrayList) estructura.get(fil);
                            Celda casilla = (Celda) fila.get(cas);
                            casilla.setColor(Color.red);
                        }
                        if(cas == 2){
                            System.out.println("Fila: " + fil + "Casilla: " + cas);
                            ArrayList fila = (ArrayList) estructura.get(fil);
                            Celda casilla = (Celda) fila.get(cas);
                            casilla.setColor(Color.yellow);
                        }
                        if(cas == 3){
                            System.out.println("Fila: " + fil + "Casilla: " + cas);
                            ArrayList fila = (ArrayList) estructura.get(fil);
                            Celda casilla = (Celda) fila.get(cas);
                            casilla.setColor(Color.blue);
                        }
                    }
                }
            }
    }
   
}