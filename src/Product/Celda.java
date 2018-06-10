/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import Decorator.Diagonales;
import java.awt.Color;

/**
 *
 * @author Andre
 */
public class Celda extends Triangulo{
    
    private int valor;
    private Color color;
    
    

    public Celda(int valor, Color color) {
        this.valor = valor;
        this.color = color;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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
        final Celda other = (Celda) obj;
        if (this.valor != other.valor) {
            return false;
        }
        if (this.color != other.color) {
            return false;
        }
        return true;
    }            
}
