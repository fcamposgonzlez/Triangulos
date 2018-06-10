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
import java.util.Random;

/**
 *
 * @author dms
 */
public class SumasHorizontales extends Decorador{
    
    
    public SumasHorizontales(Pascal pascal){
        this.pascal = pascal;
    }
    
    public ArrayList sumasHorizontales(){
        ArrayList result = new ArrayList();
        ArrayList estructura = pascal.getEstructura();
        for(int fil = 0; fil < estructura.size();fil++){       
            ArrayList larg = (ArrayList) estructura.get(fil);
            int cont = 0;
            
            Color randomColor = Color.white;
            for (int zz = 0; zz < estructura.size(); zz++){
                do {
                    Random rand = new Random();
                    float r = rand.nextFloat();
                    float g = rand.nextFloat();
                    float b = rand.nextFloat();
                    randomColor = new Color(r, g, b);
                } while( ((Celda)((ArrayList)estructura.get(zz)).get(0)).getColor() == randomColor);
            }
            
            for(int cas = 0;cas < larg.size();cas++){
                Celda valor = (Celda)larg.get(cas);
                cont = valor.getValor() + cont;
                
                valor.setColor(randomColor);
            }
            result.add(fil, cont);
        }
        return result;
    }
    
    
}
