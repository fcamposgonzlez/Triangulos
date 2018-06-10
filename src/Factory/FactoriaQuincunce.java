/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Product.Quincunce;
import Product.Triangulo;
import java.util.ArrayList;

/**
 *
 * @author dms
 */
public class FactoriaQuincunce extends FactoriaTriangulo{
    
    @Override
    public Triangulo Generar(int fila){
        ArrayList grafico = new ArrayList();
        for (int j = 0; j < 23; j++)    //Por las casillas de los bordes.
            grafico.add(0);
        
        ArrayList estructura = new ArrayList();
        for (int j = 0; j < fila; j++){
            estructura.add(new ArrayList());
            for (int k = 0; k < j+1; k++)
                ((ArrayList)estructura.get(j)).add(0);
        }
        
        Quincunce aparato = new Quincunce(estructura, grafico);
        return (Triangulo)aparato;
    }    
}
