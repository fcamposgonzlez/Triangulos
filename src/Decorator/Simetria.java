/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import Product.Celda;
import Product.Pascal;
import static com.sun.javafx.fxml.expression.Expression.and;
import java.awt.Color;
import java.util.ArrayList;
import static javafx.beans.binding.Bindings.and;

/**
 *
 * @author dms
 */
public class Simetria extends Decorador{
    
    
    public Simetria(Pascal pascal){
        this.pascal = pascal;
    }
    
    public void mostrarSimetria(){
        ArrayList estructura = pascal.getEstructura();
        for(int fil = 1;fil < estructura.size(); fil++){
            ArrayList larg = (ArrayList) estructura.get(fil);
            for(int cas = 0;cas < larg.size();cas++){
                Celda color = (Celda)larg.get(cas);
                int div = larg.size()/2;
                int cont = cas;
                if(par(larg.size()) == true){
                    if(cont < div){
                        color.setColor(Color.LIGHT_GRAY);
                    }
                    else{
                        color.setColor(Color.cyan);
                    }
                }
                else{
                    if (cont < div){
                        color.setColor(Color.LIGHT_GRAY);
                    }
                    else{if(cont > div){
                        color.setColor(Color.cyan);
                    }
                    }
                }

            }
        }
    }
    
    
    private boolean par(int valor){
        if(valor % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
}
