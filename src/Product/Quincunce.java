/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author dms
 */
public class Quincunce extends Triangulo{
    
    public ArrayList estructura;
    public ArrayList estadistica;
    
    public Quincunce(ArrayList estructura, ArrayList estadistica){                
        this.estadistica = estadistica;
        this.estructura = estructura;
    }

    public ArrayList getEstructura() {
        return estructura;
    }

    public void setEstructura(ArrayList estructura) {
        this.estructura = estructura;
    }

    @Override
    public String toString() {
        return "Quincunce{" + "estructura=" + estructura + ", estadistica=" + estadistica + '}';
    }

    public ArrayList getEstadistica() {
        return estadistica;
    }

    public void setEstadistica(ArrayList estadistica) {
        this.estadistica = estadistica;
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
        final Quincunce other = (Quincunce) obj;
        if (!Objects.equals(this.estadistica, other.estadistica)) {
            return false;
        }
        return true;
    }
    
    
}
