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
import java.util.Objects;

/**
 *
 * @author dms
 */
public abstract class Decorador {
    
    protected Pascal pascal;

    public Pascal getPascal() {
        return pascal;
    }

    public void setPascal(Pascal pascal) {
        this.pascal = pascal;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Decorador other = (Decorador) obj;
        if (!Objects.equals(this.pascal, other.pascal)) {
            return false;
        }
        return true;
    }
    
    public void limpiar(){
        ArrayList estructura = pascal.getEstructura();
        for(int fila = 0;fila < estructura.size();fila++){
            ArrayList filaAct = (ArrayList) estructura.get(fila);
            for(int celda = 0; celda < filaAct.size();celda++){
                Celda casilla = (Celda) filaAct.get(celda);
                casilla.setColor(Color.white);
            }
        }
    }
}
