/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import java.util.ArrayList;

/**
 *
 * @author dms
 */
public class Pascal extends Triangulo{
    

    public Pascal(int fila,ArrayList estructura) {
        super.fila = fila;
        super.estructura = estructura;
    }

    @Override
    public String toString() {
        String contenido = "Contenido:\n";
        for(int i = 0;super.estructura.size() > i;i++){
            for(int j = 0;j < super.estructura.get(i).size();j++){
                Celda celda = (Celda)super.estructura.get(i).get(j);
                contenido += "Valor: " + celda.getValor() + "\t" + "Color: "+ String.valueOf(celda.getColor().toString()) + "\n";
            }
        }
        return contenido;
    }
    
    
    
}