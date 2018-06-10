/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author dms
 */
public abstract class Triangulo {
    
    protected int fila;
    protected ArrayList <ArrayList> estructura; 

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public ArrayList getEstructura() {
        return estructura;
    }

    public void setEstructura(ArrayList estructura) {
        this.estructura = estructura;
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
        final Triangulo other = (Triangulo) obj;
        if (this.fila != other.fila) {
            return false;
        }
        if (!Objects.equals(this.estructura, other.estructura)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "fila=" + fila + ", estructura=" + estructura + '}';
    }
    
    
    
}
