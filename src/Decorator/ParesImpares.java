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
public class ParesImpares extends Decorador{
    

    
    public ParesImpares(Pascal pascal){
        this.pascal = pascal;
    }
    
    public void mostrarParesImpares(){
        ArrayList estructura = pascal.getEstructura();
        for(int fil = 0;fil < estructura.size(); fil++){
            ArrayList larg = (ArrayList) estructura.get(fil);
            for(int cas = 0;cas < larg.size();cas++){
                Celda valor = (Celda)larg.get(cas);
                if(parImpar(valor.getValor()) == true){
                    valor.setColor(Color.pink);
                }
                else{
                    valor.setColor(Color.green);
                }
            }
        }
    
}
 
    
    private boolean parImpar(int valor){
        if(valor % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
